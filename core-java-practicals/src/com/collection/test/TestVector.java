package com.collection.test;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("one");
		v.add(100);
		v.add(false);
		v.add("abc");

		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
