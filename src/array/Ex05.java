package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// 배열과 for문을 이용해서 5명의 자바점수를 입력받고
		// 각 학생의 자바점수를 출력하고
		// 총 자바점수의 합과 평균을 구해보세요
		
		Scanner scan = new Scanner(System.in);
		
		int[] java = new int[5];
		int sum = 0;
		
		// 입력받기(합을 구하기)
		for(int i = 0; i < java.length; i++) {
			System.out.print(i+1 + "번째 학생의 자바점수 : ");
			java[i] = scan.nextInt();
			sum += java[i];
		}
		
		// 출력하기 
		for(int i = 0;  i < java.length; i++) {
			System.out.println(i+1 + "번째 학생의 자바점수 : " + java[i]);
		}
		
		System.out.println("총 자바점수의 합 : " + sum);
		System.out.println("자바점수 평균 : " + sum / 5.0);
		
		scan.close();
		
		

	}

}









