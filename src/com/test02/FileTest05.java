package com.test02;

import java.io.*;

public class FileTest05 {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		oos.writeObject(new Address("111", "222", "333"));
		oos.writeObject(new Address("abc", "def", "ghi"));
		oos.writeObject(new Address("zyx", "wvu", "tsr"));
		oos.close();

		ObjectInputStream iis = new ObjectInputStream(new FileInputStream("data.txt"));
		System.out.println(iis.readObject());
		System.out.println(iis.readObject());
		System.out.println(iis.readObject());
		iis.close();
	}
}
