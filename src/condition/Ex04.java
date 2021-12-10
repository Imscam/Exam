package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 정수 1개를 입력받아 홀수인지 짝수인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수를 입력하세요 : ");
		a = scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		scan.close();
	}

}
