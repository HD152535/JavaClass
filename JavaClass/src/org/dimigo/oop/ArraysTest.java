package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		String[] src = {"twice", "레드벨벳", "주현도", "주동명", "권두영", "Apple"};
		System.out.println(Arrays.toString(src));
		
		
		// 배열 내용 복사하기
		String[] dest = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dest));
		
		// 주소값 비교
		System.out.println(dest == src);
		
		// 값 내용 비교
		System.out.println(Arrays.equals(src, dest));
		
		// 정렬
		Arrays.sort(src);
		System.out.println(Arrays.toString(src));
		
		//배열에 있는거 찾기 ... ?
		int index = Arrays.binarySearch(src, "권두영");
		System.out.println(index);
		
		
		
		String num1 = args[0];
		String num2 = args[1];
		
//		System.out.println(Arrays.toString(args));
		
		System.out.println(num1 + num2);
		
		
	}

}
