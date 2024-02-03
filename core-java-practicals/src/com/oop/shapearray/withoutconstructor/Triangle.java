package com.oop.shapearray.withoutconstructor;

public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void area() {
		int tArea = (base * height) / 2;
		System.out.println("Triangle Area = " + tArea);
	}
}
