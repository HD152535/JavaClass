package org.dimigo.oop;

public class StringTest2 {

	public static void main(String[] args) {

		// 1. String으로 문자열 추가하기
		// 매번 새로운 문자열을 생성함

		String str = "디미고 ";
		str += "2학년 ";
		str += "5반 ";
		str += "35번 ";
		str += "최가은";
		System.out.println(str);

		// 2. StringBuilder로 문자열 추가하기

		StringBuilder sb = new StringBuilder("디미고 ");
		// sb.append("2학년 ");
		// sb.append("5반 ");
		// sb.append("35번 ");
		// sb.append("최가은");

		// 메소드 Chaining
		sb.append("2학년 ").append("5반 ").append("35번 ").append("최가은");

		System.out.println(sb.toString());
		System.out.println(sb);

		// toString()가 구현되어있으면 toString()이 실행됨
		// toString()이 없으면 hashcode가 나옴
		Book book = new Book("미생", "윤태호", 1000);
		System.out.println(book);

		// 속도 비교 메소드
		new StringTest2().compareSpeed();

	}

	private void compareSpeed() {

		String test = "abc";
		StringBuilder sb = new StringBuilder("abc");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			// test += "def";
			sb.append("def");

		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
