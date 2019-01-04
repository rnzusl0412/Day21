package com.test01;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("c:\\MyTest\\具备\\丑备");
		f.mkdir();

		File g = new File("c:\\MyTest\\硅备");
		g.mkdir();

		g = new File("c:\\MyTest\\硅备\\a.txt");
		try {
			g.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
