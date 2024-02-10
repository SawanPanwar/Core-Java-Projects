package com.collection.test;

public class TestEqualsMethod {

	public static void main(String[] args) {

		String str1 = "abc";

		String str2 = new String("abc");

		System.out.println(str1 == str2);

		System.out.println(str1.equals(str2));

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(1, "abc", 1000);

		System.out.println("employee = " + e1.equals(e2));

	}

}
