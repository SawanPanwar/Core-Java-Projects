package com.oop.constructorcalling;

public class TestABC {

	public static void main(String[] args) {

		C c = new C();

	}

}

class A {

	A() {
		System.out.println("A default constructor");
	}
	
	A(int a) {
		this();
		System.out.println("A one param constructor");
	}

}

class B extends A {

	B() {
		super(10);
		System.out.println("B default constructor");
	}

}

class C extends B {

	C() {
		super();
		System.out.println("C default constructor");
	}

}
