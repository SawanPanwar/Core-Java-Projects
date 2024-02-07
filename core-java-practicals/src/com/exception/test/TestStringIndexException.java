package com.exception.test;

public class TestStringIndexException {

	public static void main(String[] args) {

		try {

			String name = "abc";

			System.out.println(name.charAt(5));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);

		}

	}

}
