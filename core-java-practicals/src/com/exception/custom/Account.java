package com.exception.custom;

public class Account {

	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void diposite(int amount) {

		int total = getBalance() + amount;

		setBalance(total);

		System.out.println("diposite balance = " + getBalance());

	}

	public void withdrawl(int amount) throws InsufficientBalance {

		int total = getBalance() - amount;

		if (total < 2000) {

			InsufficientBalance e = new InsufficientBalance();

			throw e;

		} else {

			setBalance(total);

			System.out.println("withdrawl balance = " + getBalance());

		}
	}
}
