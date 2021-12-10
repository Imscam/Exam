package api;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		String input = "1 fish 2 fish red fish blue fish";
		// fish는 구별자 : 데이터를 분류하기가 편하다.
		
		Scanner scan = new Scanner(input);
		
		scan.useDelimiter("\\s*fish\\s*");
		// useDelimiter 메소드로 데이터 분류를 fish 로 한다.
		
		System.out.println(scan.nextInt()); // 1
		System.out.println(scan.nextInt()); // 2
		System.out.println(scan.next()); // red
		System.out.println(scan.next()); // blue
		
		scan.close();
		

	}

}
