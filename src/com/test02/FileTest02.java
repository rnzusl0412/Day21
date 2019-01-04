package com.test02;

import java.io.*;

//stream byte read, write
public class FileTest02 {
	public static void main(String[] args) {
		File fi = new File("b.txt");
		try {
			My_Write(fi);
			My_Read(fi);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void My_Write(File f) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			for (int i = 65; i <= 90; i++) {
				fos.write(i);
			}
		} catch (FileNotFoundException g) {

		} catch (IOException i) {

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void My_Read(File f) {
		try(FileInputStream fis = new FileInputStream(f)){
		int ch = 0;
		try {
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}

	public static void My_Write02(File f) {
		try (FileOutputStream fos = new FileOutputStream(f)) {
			for (int i = 65; i <= 90; i++) {
				try {
					fos.write(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
