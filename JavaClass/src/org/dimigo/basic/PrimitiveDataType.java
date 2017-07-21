/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 8.
 * </pre>
 *
 * @author : 최가은
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// 1. 논리형

		boolean flag = true;
		if (flag) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

		// 삼항연산자
		System.out.println(flag ? "참입니다." : "거짓입니다.");

		// 2. 문자형
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; // 16진수 표기
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		char c4 = '뷁';
		int unicode = c4;
		System.out.println(c4);
		System.out.println(unicode);

		// 문자열
		String name = "나자바";
		System.out.println("My name is " + name);

		// 3. 정수형
		int i1 = 10; 					// 10진수
		int i2 = 0b00001010; 			// 2진수
		int i3 = 012; 					// 8진수
		int i4 = 0x0A; 					// 16진수
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		// 정수의 범위
		// byte의 범위(-128 ~ 127)
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);

		// 문제
		b1--;
		b2++;
		System.out.println(b1);
		System.out.println(b2);

		// 정수의 범위
		System.out.println("byte : 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("int : 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long : 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

		// 문제 : 100억을 저장하려면? (0이 10개)
		long l = 10000000000L;
		System.out.println(l);

		// 4.실수형
		float f1 = 3.14F;
		double d1 = 3.14D;
		System.out.println(f1);
		System.out.println(d1);

		// 실수의 오차
		// 실수 정밀도 테스트
		float f2 = 0.12345678901234567890F;
		double d2 = 0.12345678901234567890D;
		System.out.println(f2);
		System.out.println(d2);

		// 포맷팅 출력
		System.out.printf("%c, %d, %.2f, %s\n", 'A', 100, 12.345, "나천재");
	}

}