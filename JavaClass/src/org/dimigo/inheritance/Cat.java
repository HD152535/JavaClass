package org.dimigo.inheritance;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	//메소드 오버라이딩
	public void bark(){
		System.out.println("야옹");
	}
	
	
	//Cat에만 있는 메소드
	public void scratch(){
		System.out.println("할퀴다");
	}

	
}
