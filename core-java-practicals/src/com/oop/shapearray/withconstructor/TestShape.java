package com.oop.shapearray.withconstructor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		shape[0] = new Rectangle(10, 20);
		shape[1] = new Circle(10);
		shape[2] = new Triangle(20, 50);

		Rectangle r = (Rectangle) shape[0];

		r.setLength(100);

		for (int i = 0; i < shape.length; i++) {

			shape[i].area();

		}

	}

}
