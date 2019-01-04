package com.test01;

import java.io.*;

public class FileTest04 {
	public static void main(String[] args) {
		File fi = new File("C:\\Program Files");
		Prn(fi);
		Prn02(fi);
	}

	public static void Prn(File f) {
		// public String[] list()
		System.out.println("list()");
		for (String m_list : f.list()) {
			System.out.println(m_list);
		}
	}

	public static void Prn02(File f) {
		System.out.println("listFiles()");
		// public String[] listFiles[] //aadauthhelper.dll
		File[] res = f.listFiles();
		int file_count = 0;
		int dir_count = 0;

		for (File m_list : res) {
			if (m_list.isFile()) {
				System.out.println("Filename : " + m_list);
				file_count++;
			}
			if (m_list.isDirectory()) {
				System.out.println("Directoryname : " + m_list);
				dir_count++;
			}
		}
		System.out.println("Files count : " + file_count + 
				"\nDirectories count : " + dir_count);
	}
}
