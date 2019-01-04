package com.test01;

//stream (byte) read() write() = String이 안된다.
//char read() = String이 안된다.
import java.io.*;

public class FileTest08 {
	public static void main(String[] args) throws IOException {

		// file의 대상을 바이트 단위로 버퍼를 사용할 때는 BufferedInputStream을 사용한다.
		// byte 단위로 처리되는 것 : 이미지, 동영상, 음성파일 등
		// 대상을 파일에서 읽어서 파일로 쓰겠다.

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
