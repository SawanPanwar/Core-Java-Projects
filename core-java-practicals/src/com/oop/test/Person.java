package com.oop.test;

import java.util.Date;

public class Person {

	private String firstName = null;

	private String lastName = null;

	private Date dob = null;

	public static final int AVG_AGE = 18;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
