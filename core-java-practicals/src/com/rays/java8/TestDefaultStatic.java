package com.rays.java8;

public class TestDefaultStatic {

	public static void main(String[] args) {

		DefaultStaticInterface ds = new DefaultStaticInterface() {
			
			@Override
			public void abstractMethod() {
				System.out.println("abstract method....!!!");
			}
		};
		ds.defaultMethod();
		ds.abstractMethod();
		DefaultStaticInterface.staticMethod();
	}
}
