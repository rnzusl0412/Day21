package com.test01;

import java.io.*;

public class FileTest05 {
	public static void main(String[] args) {
		File fi = new File("C:\\MyTest");
		View(fi);
	}

	public static int cnt = 0; // ��������

	//������ �� �غ��� 
	public static void View(File fi) {
		// int cnt = 0; // ��������
		System.out.println(++cnt + " = " + fi.getName() + "\n");
		if (fi.exists()) {
			for (File str : fi.listFiles()) {
				View(str);
				System.out.println(str);
				System.out.println();
			}
		} else {
			return;
		}
	}
}
