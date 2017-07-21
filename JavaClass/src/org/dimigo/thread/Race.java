package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
	
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " thread start");

		Thread t1 = new Runner("윤태");
		Thread t2 = new Runner("현도");
		
		
		// MIN_PRIOPRITY(1), NORM_PRIORITY(5), MAX_PRIORITY(10)
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	
	}
	
}
