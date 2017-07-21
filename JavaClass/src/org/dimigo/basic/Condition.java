/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ Condition
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 15.
 * </pre>
 *
 * @author : digim
 * version : 1.0
 */

public class Condition {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// 1. if~else 문
		// 선거권 연령 : 만 19세
		int age = 17;
		
		if(age>=19){
			System.out.println("투표하러 갑시다!!");
		}
		else{
			System.out.println("선거권이 없네요 TT");
		}
		
		// 2. switch문
		// 주사위 랜덤값 뽑기 (1~6)
		System.out.println(new Random().nextInt(6)+1);
		int num = new Random().nextInt(6)+1;
		System.out.println(num);
		
		// 짝수이면 "짝수입니다", 홀수이면 "홀수입니다"
		if(num%2==0){
			System.out.println("짝수입니다");
		}
		else{
			System.out.println("홀수입니다");
		}
		
		String menu = "짬뽕";
		
		switch(menu){
		case "짜장면" :
			System.out.println("짜장면 선택");
			break;
			
		case "짬뽕" :
			System.out.println("짬뽕 선택");
			break;
			
		default:
			System.out.println("다이어트 중");
		}
		
	}

}
