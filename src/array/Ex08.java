package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력해보세요 
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력 : ");
			num[i] = scan.nextInt();
		}
		
		// 3의 배수만 출력
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 3 == 0) {
				System.out.print(num[i] + "  ");
			}
		}
		
		scan.close();
		
		

	}

}







