package com.test01;

import java.io.*;

public class FileTest03 {
	public static void main(String[] args) {
		System.out.println("1. MyTest//배구//a.txt -> MyTest02//AA//a.txt로 이동");
		System.out.println("2. MyTest//배구를 삭제");
		System.out.println("3. MyTest//야구//농구 -> 축구로 이름변경");

		File f1 = new File("c://MyTest//배구//a.txt");
		f1.renameTo(new File("c://MyTest02//AA//a.txt"));

		f1 = new File("c://MyTest//배구");
		f1.delete();

		f1 = new File("c://MyTest//야구//농구");
		f1.renameTo(new File("c://MyTest//야구//축구"));
	}
}
