package com.exception.test;

public class TestFinally {

	public static void main(String[] args) {

		try {
			int a = 10;

			int b = 0;

			System.out.println("**before**");

			int c = a / b;

			System.out.println("division = " + c);

		} catch (ArithmeticException e) {

			System.out.println(e);

		} finally {
			System.out.println("finally block");
		}

	}

}
