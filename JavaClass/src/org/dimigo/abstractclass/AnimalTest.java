package org.dimigo.abstractclass;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal a = new Animal();		//불가능!!

		Animal[] animals = {
				new Cow(),
				new Pig(),
				new Duck()
		};
		
		System.out.println("== 평온한 동물농장 ==");
		for (Animal a : animals){
			a.eat();
		}
		
		System.out.println("== 늑대 출몰 ==");
		for (Animal a : animals){
			a.bark();
		}
	}

}
