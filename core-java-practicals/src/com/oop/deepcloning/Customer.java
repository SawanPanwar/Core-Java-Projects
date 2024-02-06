package com.oop.deepcloning;

public class Customer implements Cloneable {

	String name = null;

	Account account = null;

	public Customer(String name) {
		this.name = name;
		this.account = new Account(100);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}

}
