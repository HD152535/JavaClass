package org.dimigo.thread;

import java.util.Random;

public class MultiThreadTest {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " thread start");

		
		
		System.out.println(t.getName() + " thread start");
		
		Thread t1 = new TaskThread("first");
		Thread t2 = new TaskThread("second");
		
		// 익명 클래스
		Thread t3 = new Thread(){
			String name = "third";
			int time = new Random().nextInt(5000);
			public void run(){
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name + " end");
			}
		};
		
		// multi thread
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t.getName() + " thread end");
		
	}

}
