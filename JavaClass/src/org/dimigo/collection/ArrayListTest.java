package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dimigo.interfaces.Dog;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 생성(JDK4까지)
		// List list = new ArrayList();
		// list.add("아이유");
		// list.add(100);
		// list.add(new Dog());

		// 제네릭 (Generic)
		// : List에 들어갈 데이터 타입을 지정함

		List<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("싸이");
		list.add("아이유");

		System.out.println(list.size());
		printList(list);

		System.out.println("<< 데이터 검색 >>");
		
		
		System.out.println("<< 데이터 삽입 >>");
		list.add(1, "정연");
		printList(list);

		System.out.println("<< 데이터 교체 >>");
		list.set(2, "감자");
		printList(list);

		System.out.println("<< 데이터 삭제 >>");
		list.remove("아이유");
		printList(list);

		list.remove("없는 데이터");

		System.out.println("<< 데이터 전체 삭제 >>");
		list.clear();
		printList(list);

	}

	public static void printList(List<String> list) {
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println("------------------------");
	}

	public static void printList2(List<String> list) {
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------------");
	}

	// 람다식 (Lambda Expressions)
	public static void printList3(List<String> list){
		list.forEach(value->System.out.println(value));
		System.out.println("------------------------");
	}
}
