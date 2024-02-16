package com.io.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Sawan\\Desktop\\io\\Hello.txt");

		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();

		while (line != null) {

			System.out.println(line);

			line = in.readLine();
		}

		in.close();
		file.close();
	}

}
