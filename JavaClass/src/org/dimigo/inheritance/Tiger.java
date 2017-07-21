package org.dimigo.inheritance;

public class Tiger extends Animal {

	public Tiger(String name) {
		super(name);
	}
	
	//메소드 오버라이딩
	public void bark(){
		System.out.println("어흥");
	}
	
	
	//Tiger에만 있는 메소드
	public void hunt(){
		System.out.println("사냥을 한다");
	}

	
}
