package org.dimigo.inheritance;

public class Student extends Person {

	private String studentId;

	public Student(String name, int age, int height, int weight, String studentId) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
		
		// super를 명시적으로 호출하지 않으면 기본생성자로 호출해줌
		super(name,age, height, weight);
		this.studentId = studentId;
	}

	public void study() {
		System.out.println(getName() + "학생이 공부를 합니다");
	}

	public void eatSnack() {
		System.out.println(super.getName() + "학생이 과자를 먹습니다");
	}

	public String toString() {
//		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", height=" + height
//				+ ", weight=" + weight + "]";
		
		return "Student [studentId= " + studentId + super.toString();
	}

}
