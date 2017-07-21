package org.dimigo.oop;

public class Count {

	private static int cnt;
	
	public Count(){
		cnt++;
	}
	
	public static void main(String[] args) {

		for(int i = 0 ; i < 10 ; i ++){
			new Count();
			
		}
		
		// 10이 나오게 하려면?
		System.out.println(Count.cnt);

	}

}
