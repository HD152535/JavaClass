package org.dimigo.oop;

public class ArrayBasic {

	public static void main(String[] args) {
		// int 타입 배열 선언
		int[] intArr = null;

		// int 타입 배열 생성
		intArr = new int[5];

		ArrayBasic obj = new ArrayBasic();
		obj.printArray(intArr);

		// int[] intArr2 = {1, 2, 3, 4, 5};
		// int[] intArr2 = new int[] {1, 2, 3, 4, 5};
		int[] intArr2 = null;
		// intArr2 = {1, 2, 3, 4, 5}; <- X
		intArr2 = new int[] { 1, 2, 3, 4, 5 };
		obj.printArray(intArr2);

		// String 타입 배열
		String[] strArr = new String[3];
		obj.printArray(strArr);

		strArr[0] = "EXO";
		strArr[1] = "트와이스";
		obj.printArray(strArr);

		String[] strArr2 = new String[] { "EXO", "트와이스", "레드벨벳" };
		obj.printArray(strArr2);

		// Book 타입 배열
		Book[] bookArr = new Book[2];

		bookArr[0] = new Book("미생", "윤태호", 1000);
		bookArr[1] = new Book("자바의 신", "나자바", 500);

		obj.printArray(bookArr);

		// bookArr2라는 배열을 만들고, 바로 초기화하기 (미생2, 자바의 신2)
		Book[] bookArr2 = /* new Book[] */ { new Book("미생 2", "윤태호", 1000), new Book("자바의 신 2", "윤태호", 500) };

		obj.printArray(bookArr2);

		// 배열 사용 시 주의사항
		int[] intArr3 = null;
		// System.out.println(intArr3.length);

		intArr3 = new int[3];
		System.out.println(intArr3[intArr3.length - 1]);

		String[] strArr3 = new String[3];
//		System.out.println(strArr3[0].length());

		int[] intArr4 = { 1, 2, 3, 4, 5 };

		obj.printArray(intArr4);
		int[] intArr5 = new int[] { 1, 2, 3, 4, 5 };
		obj.printArray(intArr5);

		Book[] bookArr3 = { new Book("미생", "윤태호", 1000), new Book("남한산성", "김훈", 500), };

		obj.printArray(bookArr3);

		// int score[] = {100, 90, 80};
		int[] scores = null;
		scores = new int[]{100, 90, 80};
		int sum=0;
		
		for(int i=0;i<scores.length;i++){
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/scores.length );
		
//		System.out.println(scores[3]);				//ArrayIndexOutOfBoundsException
	}

	private void printArray(Book[] bookArr) {
		for (Book v : bookArr) {
			System.out.print(v + " | ");
		}
		System.out.println();
	}

	private void printArray(String[] strArr) {
		for (String v : strArr) {
			System.out.print(v + " | ");
		}
		System.out.println();
	}

	private void printArray(int[] intArr) {
		for (int v : intArr) {
			System.out.print(v + " | ");
		}
		System.out.println();
	}

}