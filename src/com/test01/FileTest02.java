package com.test01;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File fi = new File("c:\\MyTest02");
		if (fi.exists()) {
			System.out.println("�̹� ���� �Ѵ�.");
		} else {
			fi.mkdir();
			System.out.println("���� �����ߴ�.");
		}
		String mydir = "CC";
		My_mkdir(fi, mydir);

		mydir = "DD";
		My_mkdir(fi, mydir);

	}

	public static void My_mkdir(File f, String str) {
		File fi = new File(f, str);
		fi.mkdir();
	}
}
