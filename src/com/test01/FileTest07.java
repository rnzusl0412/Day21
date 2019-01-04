package com.test01;

import java.io.*;

//stream byte read, write
public class FileTest07 {
	public static void main(String[] args) {
		File fi = new File("b.txt");
		try {
			My_Write(fi);
			My_Read(fi);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void My_Write(File f) throws IOException {
		FileOutputStream fos = new FileOutputStream(f);
		for (int i = 65; i <= 90; i++) {
			fos.write(i);
		}
		fos.close();
	}

	public static void My_Read(File f) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		int co = 0;
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);
			co++;
		}
		fis.close();
		System.out.println("\ncount : " + co);
	}
}
