package io;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 버퍼에 담는다 (성능향상)
		DataOutputStream dos = new DataOutputStream(bos);
		// DataOutputStream : 내가 원하는 데이터형태로 넣는다. (기능향상)
		
		int a = 10;
		double b = 10.23;
		String c = "Hello Java";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		dos.close();
		bos.close();
		fos.close();
		

	}

}
