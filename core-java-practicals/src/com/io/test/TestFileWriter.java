package com.io.test;

import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\Sawan\\Desktop\\io\\Write.txt", true);

		file.write("how are you");

		file.close();

	}

}
