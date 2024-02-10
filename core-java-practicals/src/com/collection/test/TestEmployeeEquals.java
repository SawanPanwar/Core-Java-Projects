package com.collection.test;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeEquals {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(2, "pqr", 2000);

		List list = new ArrayList();
		list.add(e1);
		list.add(e2);

		System.out.println(list.contains(e1));

	}

}
