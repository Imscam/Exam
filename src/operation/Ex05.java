package operation;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// 두 정수를 입력받아 사칙연산 계산을 해보자
		
		int a, b;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 : ");
		a = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 : ");
		b = scan.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
		scan.close();

	}

}











