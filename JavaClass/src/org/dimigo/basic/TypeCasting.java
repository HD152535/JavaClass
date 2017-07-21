/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ TypeCasting
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 10.
 * </pre>
 *
 * @author : digim
 * version : 1.0
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 자동형변환: 작은타입 -> 큰타입 (Promotion)
		byte b = 10;
		int i = b;
		System.out.println(b);
		System.out.println(i);
		
		//2. 강제형변환 : 큰타입 -> 작은타입(Casting)
		b=(byte)i;
		
		// 강제형변환 시 주의사항 ( 값 범위률 고려)
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		long l = 10000000000l;
		int i3= (int)l;
		System.out.println(i3);
		
		
	}

}
