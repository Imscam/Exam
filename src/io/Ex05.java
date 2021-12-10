package io;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "BTS.jpeg");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "Copy.jpeg");
		
		byte[] byteArray = new byte[1024];
		
		while(true) {
			
			int count = fis.read(byteArray);
			// 데이터는 byte 배열에 들어간다.
			// 이때 int는 몇개나 새로운 데이터를 읽었는지 count로 나온다.
			
			if(count == -1) {
				break;
			}
			
			fos.write(byteArray, 0, count);
			//byte 배열에 데이터를 0부터(맨처음부터) 새로 읽은 count만큼만 쓴다!
		}
		
		fis.close();
		fos.close();
		
	}

}






