package com.exception.custom;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(10000);

		a.diposite(5000);

		try {
			a.withdrawl(13001);
		} catch (InsufficientBalance e) {
			System.out.println();
		}

		System.out.println("after = " + a.getBalance());

	}

}
