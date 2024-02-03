package com.oop.shapearray.methodreturntype;

public class Shape {

	public void area() {
		System.out.println("Shape area method...!!!");
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Rectangle();
		}
		if (i == 2) {
			return new Circle();
		}
		if (i == 3) {
			return new Triangle();
		}
		if (i == 4) {
			return new Rectangle(10, 20);
		}
		if (i == 5) {
			return new Circle(10);
		}
		if (i == 6) {
			return new Triangle(10, 20);
		}

		return new Shape();

	}

}
