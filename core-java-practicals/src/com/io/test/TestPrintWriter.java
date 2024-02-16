package com.io.test;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\Sawan\\Desktop\\io\\Write.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("how");
		out.println("are");
		out.println("you");

		out.close();
		file.close();

	}

}
