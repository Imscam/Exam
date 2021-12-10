package io;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		// 파일이 없으면 만든다.
		// 객체생성시 true이면 이어쓰기, false이면 다시쓰기, 디폴트가 false
		
		//fos.write(65);
		// 아스키코드로 넣어진다.
		
		String msg = "Hello Java!!";
		
		byte[] by = msg.getBytes();
		
		fos.write(by, 6, 4);
		
		fos.close();

	}

}
