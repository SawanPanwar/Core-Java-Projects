package com.oop.cloning;

public class TestCloning {

	public static void main(String[] args) {

		Account a1 = new Account(100);

		Account a2 = a1;
		
		a2.balance = 200;

		System.out.println(a1.balance);

		System.out.println(a2.balance);

	}

}
