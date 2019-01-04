package com.test02;

import java.io.*;

public class FileTest03 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e.txt"));

		dos.writeInt(100);
		dos.writeDouble(90.9);
		dos.writeUTF("abc");

		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("e.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		dis.close();
	}
}
