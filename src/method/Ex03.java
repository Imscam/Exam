package method;

import java.util.Scanner;

public class Ex03 {
	// 이름과 나이의 데이터를 매개변수로 받아서
	// 출력하는 profilePrint 메소드를 만들어보자 
	
	public static void profilePrint(String name, int age) {//매개변수
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
	}
	
	public static void main(String[] args) {
		
		profilePrint("홍길동", 20); // 메소드호출
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름이 뭐에요?");
		String name = scan.next();
		
		System.out.println("나이가 몇살?");
		int age = scan.nextInt();
		
		profilePrint(name, age);
		// 입력받은 정보로 profilePrint 메소드호출
		scan.close();
		
	}

}
