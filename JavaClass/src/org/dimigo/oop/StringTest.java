package org.dimigo.oop;

public class StringTest {

	public static void main(String[] args) {
		//1. 문자열 리터럴 방식(Literal Pool에 생성, 동일 문자열인 경우 공유)
		String dog1 = "해방이";
		String dog2 = "해방이";
		System.out.println(dog1 == dog2);
		
		
		//2. new 객체 생성 	방식(매번 다른 문자열 객체를 생성)
		String cat1 = new String("나비");
		String cat2 = new String("나비");
		System.out.println(cat1 == cat2);
		
		
		//여기서 문제!
		System.out.println(dog1 == "해방이");
		System.out.println(cat1 == "나비");
		
		
		//문자열 비교시 equals 메소드 사용하기
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));
		
		//문자열 비교시 주의 사항
		String id = "admin";				//사용자가 입력한 id
		
		//id가 "admin"과 같으면 "관리자"를, 다르면 "일반사용자"를 출력
		System.out.println((id.equals("admin") ? "관리자" : "일반사용자"));
		
		
		//대소문자 구분은 ?
		System.out.println(id.equalsIgnoreCase("admin") ? "관리자" : "일반사용자");
		System.out.println(id.toLowerCase().equals("admin") ? "관리자" : "일반사용자");
		
		//id에 null을 넣으면 NullPointerException 나온다!
		
		String id2 = null;
		System.out.println("admin".equals(id2) ? "관리자" : "일반사용자");
		
		
		//자주사용되는 String 클래스 메소드
		new StringTest().testStringTest();	
	}

	private void testStringTest() {
		//			01234567890123
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length());				//문자열 길이 		//14
		System.out.println(s.substring(3));			//문자열 일부만 가져오기(beginIndex부터 마지막까지)	//defgABCDEFG
		System.out.println(s.substring(3, 6));//문자열 일부만 가져오기(beginIndex ~ endIndex까지) 	//def
		System.out.println("[" + "     ABC     ".trim() + "]");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("abc"));
		System.out.println(s.endsWith("FGH"));
		
		
	}

}
