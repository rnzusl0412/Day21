package com.test02;

import java.io.*;

public class FileTest04 {
	public static void main(String[] args) throws IOException {
		LineNumberReader li = new LineNumberReader(new FileReader("b.txt"));
		int ch = 0;
		//System.out.print(li.getLineNumber() + ".");
		while ((ch = li.read()) != -1) {
			System.out.print((char) ch);
			if ((char) ch == '\n') {
				System.out.printf("(%5d).\n",li.getLineNumber());
			}
		}
		li.close();
	}
}
