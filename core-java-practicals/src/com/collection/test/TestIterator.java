package com.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(100);
		list.add("abc");
		list.add(true);
		list.add(200);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
			
			it.remove();

		}

		System.out.println(list);

	}

}
