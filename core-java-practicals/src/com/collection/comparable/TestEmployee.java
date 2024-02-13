package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(4, "aaa", 1000);
		Employee e2 = new Employee(2, "bbb", 2000);
		Employee e3 = new Employee(3, "ccc", 8000);
		Employee e4 = new Employee(1, "ddd", 3000);
		Employee e5 = new Employee(4, "aaa", 1000);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
