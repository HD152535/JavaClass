package org.dimigo.inheritance;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
		// 메소드 오버라이딩 : 부모클래스의 메소드를 자식클래스에서 재정의함 +++오버로딩이랑 헷갈리지 말래염
		public void bark(){
			System.out.println("멍멍");
		}
		
		public void wag(){
			System.out.println("꼬리를 흔든다");
		}

}
