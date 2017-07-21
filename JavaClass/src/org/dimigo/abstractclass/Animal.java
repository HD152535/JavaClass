package org.dimigo.abstractclass;

public abstract class Animal {
	// 추상 클래스 선언 : Animal 객체 생성 불가능
	// 반드시 자식 객체를 통해서만 객체 생성 가능
	
	
	private String name;
	
	public Animal(){
		
	}

	public Animal(String name) { 
		this.name = name;
	}


	public void eat() {
		System.out.println("냠냠");
	}

	public void sleep() {
		System.out.println("쿨쿨");
	}

//	public void bark() {
//		System.out.println("...");
//	}
	
	public abstract void bark();
	

	@Override
	public String toString() {
		return "제 이름은 " + name + "입니다";
	}

}
