package org.dimigo.exception;

public class ThrowException {

	public static void main(String[] args) {
		try {
			methodA("abc", 0);
			System.out.println("이후 로직");
		} catch (Exception e) {
			System.out.println("main : " + e.getMessage());
//			e.printStackTrace();
			
		}
		
	}

	private static void methodA(String s, int i) throws Exception {
		methodB(s, i);
	}

	private static void methodB(String s, int i) throws Exception {
		try {
			if (s == null) {

				// throw new Exception("입력된 문자열이 없습니다.");
				// throw e;

				throw new Exception("입력된 문자열이 없습니다.");
			}

			System.out.println(s.length());

			if (i == 0) {
				throw new Exception("0으로 나눌 수 없습니다.");
			}
			System.out.println(100 / i);
		} catch (Exception e) {
			// Exception e = new Exception("입력된 문자열이 없습니다.");
			// 예외 처리 코드

			System.out.println("catch : " + e.getMessage());
			// 호출한 곳으로 예외 객체를 다시 던짐
			throw e;
		}
	}

}
