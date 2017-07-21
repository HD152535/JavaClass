package org.dimigo.thread;

public class Runner2 implements Runnable {

	private String name;

	public Runner2(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " 출발");
		
		for(int i = 100 ; i >= 0 ; i-=10){
			System.out.println(name + " " + i + "m");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");

	}
}
