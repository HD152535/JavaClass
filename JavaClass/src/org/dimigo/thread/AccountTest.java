package org.dimigo.thread;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account(10000);

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0 ; i < 5 ; i++){
					account.deposit(2000);		//10,000 입금
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0 ; i < 3 ; i++){
					account.withdraw(3000);		//9,000 출금
				}
			}
		};

		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("최종 잔액 : " + account.getBalance());
	}

}
