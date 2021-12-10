package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 작은수부터 나열하세요
		// 배열 for문 if문 Scanner 사용
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		
		// 입력받기
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번째 숫자 : ");
			num[i] = scan.nextInt();
		}
		
		// 정렬 (이중 for문 사용)
		int temp = 0;
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = i; j < num.length; j++) {
				
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.printf("%d, %d, %d, %d, %d", num[0], num[1], num[2], num[3], num[4]);
		
		scan.close();

	}

}
