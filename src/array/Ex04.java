package array;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 배열과 for문을 이용해서 3명의 이름을 입력받고 출력해보자
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		
		// 입력받기 
		for(int i = 0; i < 3; i++) {
			System.out.print(i+1 + "번째 이름을 입력 : ");
			name[i] = scan.nextLine();
		}
		
		// 출력하기 
		for(int i = 0; i < name.length; i++) {
			System.out.println(i+1 + "번째 이름 : " + name[i]);
		}
		
		scan.close();
		
	}

}
