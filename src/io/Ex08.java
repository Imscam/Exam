package io;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕하세요");
		pw.println("자바 강사입니다.");
		pw.println("오늘이 마지막 수업이네요");
		pw.println("항상 행복하세요");
		
		pw.close();
		bw.close();
		fw.close();
		

	}

}
