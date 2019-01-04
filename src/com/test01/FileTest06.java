package com.test01;

import java.io.*;
//file 입출력
//java.lang.AutoCloseable, java.io.Closeable

public class FileTest06 {
	public static void main(String[] args) {
		File fi = new File("a.txt"); // 현재 디렉토리
		try (FileWriter fw = new FileWriter(fi)) {
			fw.write("abcdefg \n");
			fw.write("abcdefg \n");
			fw.write("a b c d e f g");
		} catch (Exception e) {
		}
		try (FileReader fr = new FileReader(fi)) {
			int co = 0;
			int ch;
			// 한글자씩 읽어서 리턴하자 글자없으면 -1을 리턴한다.
			// 한글자씩 -1이 아닐때까지 읽어서 리턴한다.
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
				co++;
			}
			System.out.println("\n\ncount : " + co);
		} catch (Exception e) {
		}
	}
}
