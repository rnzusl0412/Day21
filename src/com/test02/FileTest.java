package com.test02;

import java.io.*;

//char�� �а� ����. ��, ���۸�����
//File, FileReader, BufferdReader	=> readLine

public class FileTest {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("b.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}
