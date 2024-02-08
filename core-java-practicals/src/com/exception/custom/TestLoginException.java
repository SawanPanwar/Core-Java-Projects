package com.exception.custom;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {

		String login = "admi";

		System.out.println("**before**");

		if (login.equals("admin")) {
			System.out.println("valid user id..!!!");
		} else {
			LoginException e = new LoginException();
			throw e;
		}

		System.out.println("**after**");

	}

}
