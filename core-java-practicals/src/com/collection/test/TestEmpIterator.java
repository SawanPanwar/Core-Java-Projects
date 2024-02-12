package com.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmpIterator {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 1000);

		Employee e2 = new Employee(2, "pqr", 2000);

		List<Employee> list = new ArrayList();

		list.add(e1);
		list.add(e2);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Employee emp = (Employee) it.next();

			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());

		}

	}

}
