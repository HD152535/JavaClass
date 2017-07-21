package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		System.out.println("<< 데이터 추가 >>");
		map.put("kor", 80);
		map.put("mat", 100);
		map.put("eng", 90);
		System.out.println(map.size());

		map.put("eng", 95);
		printMap(map);
		
		System.out.println("<< 데이터 검색 >>");
		System.out.println(map.get("mat"));
		System.out.println(map.get("eng"));
		System.out.println(map.get("java"));
		
		System.out.println("<< 데이터 삭제 >>");
		map.remove("mat");
		printMap(map);
		
		System.out.println("<< 데이터 전체 삭제 >>");
		map.clear();
		printMap(map);
	}


	// keySet()을 이용한 방법
	private static void printMap(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-------------------------");
	}
	
	
	// entrySet()을 이용한 	방법
	private static void printMap2(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("-------------------------");
	}

	// 람다식 이용
	private static void printMap3(Map<String, Integer> map) {
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-------------------------");
	}
}
