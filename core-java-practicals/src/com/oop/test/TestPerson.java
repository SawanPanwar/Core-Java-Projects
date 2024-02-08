package com.oop.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String  str = "01-01-2024";
		
		Person p = new Person();

		p.setFirstName("abc");
		p.setLastName("xyz");
		p.setDob(new Date());

		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getDob());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(p.AVG_AGE);
		System.out.println(Person.AVG_AGE);

	}
}
