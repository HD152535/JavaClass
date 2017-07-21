package org.dimigo.oop;

public class CalculatorTest {

	public static void main(String[] args) {

		System.out.println("<< 실행 결과 >>");
		System.out.println();

		int a = 10;
		int b = 20;

		Calculator calc = new Calculator(a, b);

		calc.powerOn();

		System.out.println(a + " + " + b + " = " + Calculator.add(a, b, calc));
		System.out.println(a + " - " + b + " = " + Calculator.sub(a, b, calc));
		System.out.println(a + " * " + b + " = " + Calculator.mul(a, b, calc));
		System.out.println(a + " / " + b + " = " + Calculator.div(a, b, calc));

		calc.powerOff();

	}

}
