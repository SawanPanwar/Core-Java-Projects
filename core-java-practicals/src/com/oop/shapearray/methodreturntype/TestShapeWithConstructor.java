package com.oop.shapearray.methodreturntype;

public class TestShapeWithConstructor {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		shape[0] = Shape.getShape(4);
		shape[1] = Shape.getShape(5);
		shape[2] = Shape.getShape(6);

		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
	}
}
