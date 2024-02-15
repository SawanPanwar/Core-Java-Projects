package com.collection.test;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(2, "pqr", 2000);

		List list = new ArrayList();

		list.add(1);
		list.add("xyz");
		list.add(e1);
		list.add(e2);

		list.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("list => " + list);

		System.out.println("========================================");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		System.out.println("================for loop====================");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		System.out.println("=================foreach loop=================");

		for (Object o : list) {

			System.out.println(o);

		}

		System.out.println("================list get method=================");

		int id = (int) list.get(0);

		String name = (String) list.get(1);

		Employee emp = (Employee) list.get(2);

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
