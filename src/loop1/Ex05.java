package loop1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// for문을 사용해서 숫자를 5번 입력받고,
		// 입력받을 때마다 더해지는 프로그램을 만들어보자
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("정수 5개를 입력하세요 : ");
			num = scan.nextInt();
			sum += num;
			System.out.printf("%d번째 합계 : %d\n", i, sum);
		}
		
		scan.close();

	}

}






