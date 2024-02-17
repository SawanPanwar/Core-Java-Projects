package com.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("C:\\Users\\Sawan\\Desktop\\customLogo.jpg");

		FileOutputStream out = new FileOutputStream("C:\\Users\\Sawan\\Desktop\\io\\rays.jpg");

		int ch = in.read();

		while (ch != -1) {

			out.write(ch);

			ch = in.read();

		}

		out.close();
		in.close();

	}

}
