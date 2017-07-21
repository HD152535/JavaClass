package org.dimigo.thread;

import java.util.Random;

public class TaskThread2 implements Runnable{

	private String name;
	private int time;
	
	public TaskThread2(String name){
		this.name = name;
		time = new Random().nextInt(5000);		// 0 ~ 4999
			
		
	}
	
	@Override
	public void run() {
		System.out.println(name + " Start");
		System.out.println(name + " Sleep time : "+ time);
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " end");
	}
}
