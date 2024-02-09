package com.collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(1);
		c1.add("abc");
		c1.add(true);
		c1.add(100.99);

		Collection c2 = new ArrayList();

		c2.add(100.99);
		c2.add(100);
		c2.add(false);
		c2.add("xyz");

		System.out.println("c1 = " + c1);

		c1.addAll(c2);

		System.out.println("c1 = " + c1);

		// c1.clear();

		System.out.println("c1 contains = " + c1.contains("xyz"));

		System.out.println("c1 containsAll = " + c1.containsAll(c2));

		System.out.println("c1 isEmpty = " + c1.isEmpty());

		// System.out.println("c1 remove = " + c1.remove("xyz"));

		// System.out.println("c1 = " + c1);

		// System.out.println("c1 removeAll = " + c1.removeAll(c2));

		// System.out.println("c1 = " + c1);

		System.out.println("c1 = " + c1);

		System.out.println("c2 = " + c2);

		c1.retainAll(c2);

		System.out.println("c1 after retainAll = " + c1);
		
		System.out.println("c1 size = " + c1.size());

	}
}
