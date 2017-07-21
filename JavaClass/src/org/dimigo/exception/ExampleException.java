package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ExampleException {

	public static void main(String[] args) {
		// Exception의 종류 알아보기

		try {
			uncheckedException("Hello, World");
//			uncheckedException("Hi"); // 5개 이하의 문자열이여서 uncheckedException 발생
			checkedException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

	// UncheckedException : 컴파일러가 강제적으로 예외처리를 요구하지 않음
	// 개발자가 주의하여 예외 처리를 해주어야 함
	private static void uncheckedException(String str) throws Exception {
		// str이 null이면 "문자열을 입력하세요"라는 예외 객체를 생성해서 던짐
		// str의 길이가 5 미만이면 "문자열의 길이는 5 이상이어야 합니다"라는 예외 객체를 생성해서 던짐
		if (str == null || str.equals("")) {
			throw new Exception("문자열을 입력하세요");

		}
		if (str.length() < 5) {
			throw new Exception("문자열의 길이는 5 이상이어야 합니다");
		}

		System.out.println(str.substring(0, 5));
	}

	// CheckException : 컴파일러가 강제적으로 예외처리를 요구함
	private static void checkedException() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력값 => ");
		 String s = br.readLine();
		 System.out.print("출력값 => " + s);
		 br.close();

	}

}
