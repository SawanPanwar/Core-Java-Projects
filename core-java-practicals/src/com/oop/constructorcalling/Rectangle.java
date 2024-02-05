package com.oop.constructorcalling;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
		System.out.println("Rectangle default constructor");
	}

	public Rectangle(int length, int width) {
		this(length, width, "green", 100);
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color, int borderWidth) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
}
