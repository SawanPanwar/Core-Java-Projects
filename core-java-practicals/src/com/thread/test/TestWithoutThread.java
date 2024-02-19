package com.thread.test;

public class TestWithoutThread {

	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("abc");
		WithoutThread t2 = new WithoutThread("xyz");
		
		t2.run();
		t1.run();
	}

}
