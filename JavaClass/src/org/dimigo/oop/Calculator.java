package org.dimigo.oop;

public class Calculator {

	/************ 인스턴스 필드 ************/
	private int num1;
	private int num2;
	private boolean powerFlag;

	/************ 정적 필드 ************/
	public static double PI = 3.141592;
	
	/************ 생성자 ************/
	public Calculator() {

	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/************ 정적 메소드 ************/
	public void powerOn() {
		if (!powerFlag) {
			System.out.println("전원을 켭니다.");
			this.powerFlag = true;
		}

	}

	public void powerOff() {
		if(powerFlag){
			System.out.println("전원을 끕니다.");
			this.powerFlag= false;
		}
		
	}

	public static int add(int a, int b, Calculator calc) {
		calc.powerOn();
//		this.powerOn();
		return a + b;
	}

	public static int sub(int a, int b, Calculator calc) {
		calc.powerOn();
//		this.powerOn();
		return a - b;
	}

	public static int mul(int a, int b, Calculator calc) {
		calc.powerOn();
//		this.powerOn();
		return a * b;
	}

	public static double div(int a, int b, Calculator calc) {
		calc.powerOn();
//		this.powerOn();
		return (double)a/b;
	}
}
