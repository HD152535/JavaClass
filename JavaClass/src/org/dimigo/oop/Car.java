package org.dimigo.oop;

public class Car {

	// 정적 필드
	private static String company;

	// 인스턴스 필드
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	// 1. static 메소드에서 static 필드 호출 가능
	public static String getCompany() {
//		System.out.println(name);				//static 메소드에서 인스턴스 필드 호출 불가능
		return company;
	}

	public static void setCompany(String company) {
		Car.company = company;
	}
	
	// 2. 인스턴스 메소드에서 인스턴스 필드 호출 가능
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 3. 인스턴스 메소드에서 static 필드 호출 가능
	public String toString() {
		return company + " : " + name;
	}
	
	// 4. static 메소드에서 인스턴스 필드 호출 불가능
	
	

}
