package com.test01;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("c:\\MyTest\\�߱�\\��");
		f.mkdir();

		File g = new File("c:\\MyTest\\�豸");
		g.mkdir();

		g = new File("c:\\MyTest\\�豸\\a.txt");
		try {
			g.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
