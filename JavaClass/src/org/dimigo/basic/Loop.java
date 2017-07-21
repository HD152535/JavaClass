/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 15.
 * </pre>
 *
 * @author : digim version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1. for문
		// 구구단 출력하기
		// 2*1=2 2*2=4 .... 2*9=18
		// ..
		// 9*1=9 9*2=18 ... 9*9=81

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i * j);
			}
			System.out.println();
		}
		
		// 2. for-each문
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for (int v : arr){
			System.out.println(v);
		}
		
		// 트와이스 멤버 출력
		String[] twice = {"정연", "쯔위", "다현", "모모", "사나", "채영", "나연", "미나", "지효"};
		for (String v : twice){
			System.out.println(v);
		}
		
		// 3. while, do~while문
		// 메뉴처리
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		
		do{
			System.out.println("<< 메뉴 선택 >>");
			System.out.println("1. 후라이드치킨");
			System.out.println("2. 간장치킨");
			System.out.println("9. 종료");
			System.out.print("=== 당신의 선택은? ");
			
			choice = scanner.nextInt();
			
			
			switch(choice){
			case 1:
				System.out.println("후라이두!");
				break;
			case 2:
				System.out.println("간장췌킨!");
				break;
			case 3:
				System.out.println("빠이빠잇!");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다");
				
			}
		} while(choice != 9);
		
		
		
		
	}


}
