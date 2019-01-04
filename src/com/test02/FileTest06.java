package com.test02;

import java.io.*;
import java.util.*;

public class FileTest06 {
	public static void main(String[] args) throws IOException {
		File f = new File("b.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
