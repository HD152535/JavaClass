/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 14.
 * </pre>
 *
 * @author : digim
 * version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. 산술연산자
		int a=5, b=2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		//2.5가 나오게 하려면?
		System.out.println((double)a / b);
		
		//0으로 나누면?
//		System.out.println(a / 0);
		
		// 2. 다른 타입간의 연산
		int i = 10;
		double d = 3.14;
		double r1 = i + d;
		int r2 = (int)(i + d);
		
		System.out.println(r1);
		System.out.println(r2);
		
		 // 3. int보다 작은 타입간의 연산
		short s1 = 1, s2 = 2;
		short r3 = (short) (s1 + s2);
		
		// 4. Short-Circuit 테스트
		boolean flag = true;
		a = 10;
		b = 0;
		
		if(flag || (a/b==0)){
			System.out.println("OR 연산");
		}
		
		// OR 연산은 true가 도리 가능성이 높은 것을 먼저 작성
		if(flag || (a / b == 0)){
			System.out.println("OR 연산");
		}
		
		//AND 연산은 false가 될 가능성이 높은 것을 먼저 작성
		if(!flag && (a / b == 0)){
			System.out.println("AND 연산");
		}
		
		// 5. 문자열 연결 연산자
		String school = "디미고";
		int grade = 2;
		int ban = 5;
		String name = "나자바";
		System.out.println(school + grade + ban + name);
		System.out.println(grade + ban + school + name);
		
		// 문제 ) 25디미고나자바를 출력하려면 ?
		System.out.println("" + grade + ban + school + name);
		System.out.println(grade + (ban + school)+ name);
	}

}
