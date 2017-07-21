package org.dimigo.oop;

public class BookTest2 {

	//값 비교 메소드 추가
	private void compare() {
		//1. Primitive Type간 비교
		int a = 10;
		int b = a;
		
		System.out.println((a==b) ? true : false);
		
		//2. Reference Type간 비교
		Book book = new Book("미생", "윤태호", 1000);
		Book book2 = book;
		
		System.out.println((book == book2)? true: false);
		
		book2.setTitle("자바를 잡아라");
		System.out.println(book.getTitle());
		System.out.println(book2.getTitle());
	}
	
	
	public static void main(String[] args) {
		BookTest2 bt = new BookTest2();
		bt.compare();

		System.out.println("--------------------------");
		
		
		int num = 5;
		bt.changePrimitive(num);
		System.out.println("main : " + num);
		
		
		System.out.println("--------------------------");
		
		
		Book book = new Book("미생");
		btchangeReference(book);
		System.out.println(book.getTitle());				//미생
		
		
		System.out.println("--------------------------");
		
		bt.changeAttribute(book);
		System.out.println(book.getTitle());
		
		System.out.println("--------------------------");
		
		//NullPointException
		Book book2 = null;
		System.out.println(book2);
//		System.out.println(book2.getTitle());
		
		book2 = new Book();
		System.out.println(book2);
		System.out.println(book2.getTitle());
		System.out.println(book2.getTitle().length());
		
		
	}


	private void changeAttribute(Book book) {
		book.setTitle("최가은");
		System.out.println(book.getTitle());
		
		
	}


	private static void btchangeReference(Book book) {
		System.out.println(book.getTitle());				//미생
		book = new Book("이것이 자바다");
		System.out.println(book.getTitle());				// 이것이 자바다
	}


	private void changePrimitive(int num) {
		num += 10;
		System.out.println("changePrimitive: " + num);
		
		
		
	}

}
