package com.oop.shapearray.withconstructor;

public class Circle extends Shape {

	private int radius;

	public static final double PI = 3.14;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {

		double cArea = PI * radius * radius;

		System.out.println("Circle Area = " + cArea);

	}

}
