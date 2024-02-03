package com.oop.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date today = new Date();

		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(sdf.format(today));
		
		String str = "31-01-2024";
		
		System.out.println(sdf.parse(str));

	}

}
