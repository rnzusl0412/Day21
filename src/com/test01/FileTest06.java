package com.test01;

import java.io.*;
//file �����
//java.lang.AutoCloseable, java.io.Closeable

public class FileTest06 {
	public static void main(String[] args) {
		File fi = new File("a.txt"); // ���� ���丮
		try (FileWriter fw = new FileWriter(fi)) {
			fw.write("abcdefg \n");
			fw.write("abcdefg \n");
			fw.write("a b c d e f g");
		} catch (Exception e) {
		}
		try (FileReader fr = new FileReader(fi)) {
			int co = 0;
			int ch;
			// �ѱ��ھ� �о �������� ���ھ����� -1�� �����Ѵ�.
			// �ѱ��ھ� -1�� �ƴҶ����� �о �����Ѵ�.
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
				co++;
			}
			System.out.println("\n\ncount : " + co);
		} catch (Exception e) {
		}
	}
}
