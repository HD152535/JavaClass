package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {

		Car[] cars = { new Car("제네시스"), new Car("에쿠스"), new Car("소나타") };

		Car.setCompany("현대");

		for (Car car : cars) {
			System.out.println(car.toString());
		}

		Car.setCompany("기아");

		for (Car car : cars) {
			System.out.println(car);
			
		System.out.println(String.format("%,d", 10000));
		System.out.println(Integer.parseInt("100"));
		System.out.println(Math.abs(-12));
		
		}

	}

}
