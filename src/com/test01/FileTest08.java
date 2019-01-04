package com.test01;

//stream (byte) read() write() = String�� �ȵȴ�.
//char read() = String�� �ȵȴ�.
import java.io.*;

public class FileTest08 {
	public static void main(String[] args) throws IOException {

		// file�� ����� ����Ʈ ������ ���۸� ����� ���� BufferedInputStream�� ����Ѵ�.
		// byte ������ ó���Ǵ� �� : �̹���, ������, �������� ��
		// ����� ���Ͽ��� �о ���Ϸ� ���ڴ�.

		File f = new File("#1.png");
		FileInputStream fi = new FileInputStream(f);
		BufferedInputStream bi = new BufferedInputStream(fi);

		File res = new File("#1.jpg");
		FileOutputStream fo = new FileOutputStream(res);
		BufferedOutputStream bfo = new BufferedOutputStream(fo);
		int ch = 0;
		while ((ch = bi.read()) != -1) {
			bfo.write(ch);
		}
		
		bfo.close();
		fo.close();
		bi.close();
		fi.close();
	}
}
