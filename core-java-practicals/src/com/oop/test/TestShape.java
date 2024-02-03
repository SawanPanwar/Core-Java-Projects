package com.oop.test;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setBorderWidth(100);
		s.setColor("red");

		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());

	}

}
