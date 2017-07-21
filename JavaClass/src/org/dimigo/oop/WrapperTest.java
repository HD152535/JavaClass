package org.dimigo.oop;

public class WrapperTest {

	public static void main(String[] args) {
		
		int i = Integer.parseInt("100");
		System.out.println("100");
		System.out.println(i);
		System.out.println(i == 100);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.toString(100));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		
		
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		 
		Integer obj3 = Integer.valueOf(100);
		Double obj4 = Double.valueOf(3.141592);
				
		// Unboxing
		System.out.println(obj1.intValue() == obj2.intValue());
		System.out.println((obj4.doubleValue() == 3.141592));
		
		
		(new Integer(args[0])).intValue();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.println(num1 + num2);
		
		 
		Integer obj5 = new Integer(1000);
		Integer obj6 = new Integer(2000);
		
		Integer result = obj5 + obj6;
		
		System.out.println(result);
		
		Integer obj7 = 1000;
		int j = obj7 + 100;
		System.out.println(j);
		

		Integer n1 = 10;
		Integer n2 = n1 + 20;
		Integer result2 = n1 + n2;
		

	}

}
