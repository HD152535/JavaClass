package org.dimigo.thread;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	// 입금처리
	public synchronized void deposit(int money) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			balance += money;
			System.out.println(money + "원 입금 => 잔액 : " + balance);
		}
	}

	// 출금처리
	public synchronized void withdraw(int money) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {

			balance -= money;
			System.out.println(money + "원 출금 => 잔액 : " + balance);

		}
	}
}
