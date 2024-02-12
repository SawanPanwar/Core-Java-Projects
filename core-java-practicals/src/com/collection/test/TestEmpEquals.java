package com.collection.test;

public class TestEmpEquals {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(1, "abc", 1000);

		System.out.println("employee = " + e1.equals(e2));

	}

}
