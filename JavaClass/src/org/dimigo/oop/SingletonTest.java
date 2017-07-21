package org.dimigo.oop;

public class SingletonTest {

	public static void main(String[] args) {
		
		// Singleton 객체를 단 한개만 만들도록 하려면?
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
//		Singleton s3 = new Singleton();
		
		System.out.println(s1);
		System.out.println(s2);
		s1.a = 5;
	}

}
