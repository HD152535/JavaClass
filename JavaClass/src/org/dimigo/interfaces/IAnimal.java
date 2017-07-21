package org.dimigo.interfaces;

public interface IAnimal {

	// 상수 선언 가능 (public static final이 붙음)
	public static final String SCHOOL = "디미고";
	String FARM_NAME = "디미 동물농장";
	
	// 추상 메소드 선언 가능
//	public abstract void eat();
//	void sleep();
	void bark();
	
	
	
	// JDK8에서 추가된 내용
	// 1. 정적 메소드(public이 알아서 붙는다)
	public static void welcome(){
		System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
	}
	
	// 2. 디폴트 메소드
	public default void eat(){
		System.out.println("냠냠");
	}
	
	public default void sleep(){
		System.out.println("쿨쿨");
	}
	
}
