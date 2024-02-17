package com.io.test;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Sawan\\Desktop\\io\\Hello.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

		file.close();
		sc.close();

	}

}
