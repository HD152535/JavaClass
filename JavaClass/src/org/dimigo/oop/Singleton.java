package org.dimigo.oop;

public class Singleton {
	public int a;
	// 클래스가 로드되는 시점에 객체가 생성됨
	private static Singleton instance;
	
	
	// new로 객체 생성을 못함
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	
	// 필요한 시점에 객체를 생성하는 방식 (lazy Initialization 방식)
	// synchronized 동기화처리 ; 자물쇠채우기 ?
	public static synchronized Singleton getInstance2(){
		
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}

}