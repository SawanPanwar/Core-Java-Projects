package com.oop.inheritance;

public class Shape {

	private int borderWidth = 0;
	private String color = null;

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void area() {
		System.out.println("Shape area method...!!!");
	}
	
	public void area(int total) {
		System.out.println("Shape area method...!!!");
	}
}
