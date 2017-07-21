package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person("주현도", 18, 178, 65);
		System.out.println(p);
		p.eat();
		p.sleep();

		Student s = new Student("주동명", 17, 178, 65, "2534");
		System.out.println(s);
		s.study();
		s.eatSnack();
		
		s.eat();
		s.sleep();
	
		Teacher t = new Teacher("김상욱", 35, 175, 100, "물리");
		System.out.println(t);
		t.teach();
		t.doTask();
		
		t.eat();
		t.sleep();
		
	}

}
