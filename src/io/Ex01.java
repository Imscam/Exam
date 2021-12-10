package io;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		File file1 = new File("C:\\aaa\\aaa.txt");
		// 파일이 없어도 상관없다.
		
		File file2 = new File("C:\\aaa", "aaa.txt");
		// 폴더경로와 파일명으로 나타낼 수 있다.
		
		File file3 = new File("C:\\aaa");
		// 폴더까지만 만들 수 있다.
		
		File file4 = new File(file3, "aaa.txt");
		// 파일경로의 객체를 넣어서 만들 수 있다.
		
		// 윈도우 폴더구별자 : \
		// 리눅스 폴더구별자 : /
		// 윈도우 패스구별자 : ;
		// 리눅스 패스구별자 : :
		
		File dir = new File("C:" + File.separator + "aaa");
		// File.separator : 폴더구별자
		File file = new File(dir, "aaa.txt");
		
		
		
		
	}

}
