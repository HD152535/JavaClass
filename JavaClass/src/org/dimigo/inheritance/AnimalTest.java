package org.dimigo.inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Animal("동물");
		System.out.println(a);
		a.bark(); // Animal.bark();

		Dog d = new Dog("멍멍이");
		System.out.println(d);
		d.bark(); // Dog.bark();
		d.wag();

		Cat c = new Cat("야옹이");
		System.out.println(c);
		c.bark(); // Cat.bark();
		c.scratch();

		Tiger t = new Tiger("호돌이");
		System.out.println(t);
		t.bark(); // Tiger.bark();
		t.hunt();

		// Upcasting의 장점
		// 1. 배열 처리 가능
		Animal[] animals = { 
				new Dog("멍멍이"), 
				new Cat("야옹이"), 
				new Tiger("호돌이") };

		for (Animal animal : animals) {
			System.out.println(animal);
			animal.bark();
			// 2. 메소드 호출 가능
			doBark(animal);
		}

		// 3. 객체간 교환이 가능(인터페이스에서 다룸)
		Animal animal = new Dog("멍멍이");
		animal.bark();
		Dog dog = (Dog) animal;
		dog.wag();
		
		((Dog)animal).wag();

		animal = new Cat("야옹이");
		animal.bark();

		((Cat)animal).scratch();
		
		// 강제 형변환 (자식 클래스 타입으로 형변환)
		Cat cat = (Cat) animal;
		cat.scratch();

	}

	private static void doBark(Animal animal) {
		System.out.println(animal);
		animal.bark();
	}

}
