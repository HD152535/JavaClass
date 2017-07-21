package org.dimigo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {
	public static void main(String[] args) {
		// 2. 메인에서 JVM으로 예외 객체 전달
		// 3. JVM이 예외 객체를 받으면 에러 메시지를 출력하고 프로그램을 종료시킴
		System.out.println("입력한 숫자 : " + input3());
	}

	public static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 => ");
		int n = scanner.nextInt(); // 1, 예외 발생 (예외 객체를 생성해서 던짐)

		scanner.close();

		return n;
	}

	// 예외 처리 추가
	// try ~ catch 구문
	public static int input2() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 => ");
			int n = scanner.nextInt(); // 1, 예외 발생 (예외 객체를 생성해서 던짐)

			scanner.close();

			return n;
		} catch (InputMismatchException ime) {
			System.out.println("숫자를 입력하세요!!");
			return 0;
		}
	}

	// try ~ catch ~ finally 구문
	public static int input3() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 => ");
			int n = scanner.nextInt(); // 1, 예외 발생 (예외 객체를 생성해서 던짐)

			return n;
		} catch (InputMismatchException ime) {
			System.out.println("숫자를 입력하세요!!");
			return 0;
		} finally {
			// 예외 발생 여부와 관계없이 실행되는 코드
			System.out.println("finally절 실행");
			scanner.close();
		}
	}

	// try 블록에서 다른 오류 발생시 어떻게 잡나
	public static int input4() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 => ");
			int n = scanner.nextInt(); // 1, 예외 발생 (예외 객체를 생성해서 던짐)

			String s = null;
			System.out.println(s.length());

			return n;

			// 상속 관계에 있는 여러 개의 catch 블록 작성 시 반드시 자식부터 작성하기
		} catch (InputMismatchException ime) {
			// 예외 처리 코드
			System.out.println("숫자를 입력하세요!!");
			return 0;
		} catch (NullPointerException npe) {
			System.out.println("문자열 처리 오류");
			return 0;
		} catch (Exception e) {
			System.out.println("알 수 없는 오류 발생");
			return 0;
		} finally {
			// 예외 발생 여부와 관계없이 실행되는 코드
			System.out.println("finally절 실행");
			scanner.close();
		}
	}

}