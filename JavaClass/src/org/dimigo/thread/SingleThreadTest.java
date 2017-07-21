package org.dimigo.thread;

import java.util.Random;

public class SingleThreadTest {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " thread start");

		int time = new Random().nextInt(5000); // 0~4999
		System.out.println("첫번째 random 값 : " + time);

		// 특정 시간동안 실행을 중지시킴
		// 실행 상태 -> 실행 대기 상태
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Random().nextInt(5000); // 0~4999
		System.out.println("첫번째 random 값 : " + time);

		// 특정 시간동안 실행을 중지시킴
		// 실행 상태 -> 실행 대기 상태
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t.getName() + "thread end");

	}

}
