package org.dimigo.thread;

public class SyncTest {

	private int data;

	public static void main(String[] args) {
		SyncTest s = new SyncTest();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				s.add();
				System.out.println(Thread.currentThread().getName() + " end");
			}

		});

		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				s.add();
				System.out.println(Thread.currentThread().getName() + " end");
				
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("data => " + s.data);
		
	}
	
	

	private synchronized void add() {
		for (int i = 0; i < 10000; i++) {
			synchronized (this) {
				data++;
			}
		}
	}

}
