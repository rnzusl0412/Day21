package com.test01;

import java.io.*;

public class FileTest03 {
	public static void main(String[] args) {
		System.out.println("1. MyTest//�豸//a.txt -> MyTest02//AA//a.txt�� �̵�");
		System.out.println("2. MyTest//�豸�� ����");
		System.out.println("3. MyTest//�߱�//�� -> �౸�� �̸�����");

		File f1 = new File("c://MyTest//�豸//a.txt");
		f1.renameTo(new File("c://MyTest02//AA//a.txt"));

		f1 = new File("c://MyTest//�豸");
		f1.delete();

		f1 = new File("c://MyTest//�߱�//��");
		f1.renameTo(new File("c://MyTest//�߱�//�౸"));
	}
}
