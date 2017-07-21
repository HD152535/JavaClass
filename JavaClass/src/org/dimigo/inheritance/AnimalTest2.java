package org.dimigo.inheritance;

public class AnimalTest2 {

	public static void main(String[] args) {

		Animal a = new Cat("야옹이");

		// a.scratch(); // 컴파일 타임 시에는 타입 기준으로 체크한다!
		a.bark(); // 런타임 시에는 오버라이딩 된 메소드 실행됨!

		// 자식클래스 타입으로 형변환(Downcasting)
		Cat c = (Cat) a;
		c.scratch();

		((Cat) a).scratch();

		// Dog d = (Dog)a; 						// ClassCastException

		// instanceof 연산자
		Animal a1 = new Dog("멍멍이");
		Animal a2 = new Cat("야옹이");
		System.out.println(a1 instanceof Dog); 	// true
		System.out.println(a2 instanceof Cat); 	// true
		System.out.println(a1 instanceof Cat); 	// false
		System.out.println(a2 instanceof Dog); 	// false
		System.out.println(a1 instanceof Animal); // true
		System.out.println(a2 instanceof Animal); // true

		
		func(a1);
		func(a2);
		func(null);
		
	}

	
	private static void func(Animal a) {
		if(a==null) return;
		// Cat 객체이면 scratch()를 호출하고,
		// Dog 객체이면 wag()를 호출해보자
		
		if (a instanceof Cat) {
			((Cat) a).scratch();
		} else if(a instanceof Dog) {
			((Dog) a).wag();
		}
	}

}
