package org.dimigo.interfaces;

public class AnimalTest {

	public static void main(String[] args) {
		// 배열을 이용한 다형성
		IAnimal[] animals = { new Dog(), new Cat() };

		for (IAnimal a : animals) {
			doAction(a);
		}

		// 익명 객체 생성
		// 1) 클래스명 ref 변수 = new 클래스명();
		// 2) 인터페이스명 ref 변수 = new 인터페이스명(){
		// };
		IAnimal tiger = new IAnimal() {

			@Override
			public void bark() {
				System.out.println("어흥");
			}
		};
		doAction(tiger);
		
	}

	// 매개변수를 이용한 다형성
	private static void doAction(IAnimal a) {
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getSimpleName());
		
		
		a.eat();
		a.sleep();
		a.bark();

		// Dog 타입인 경우 wag() 메소드 호출

		if (a instanceof Dog) {
			((Dog) a).wag();
		}

		System.out.println();
	}

}
