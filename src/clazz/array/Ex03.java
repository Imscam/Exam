package clazz.array;

import java.util.Scanner;

// People 클래스를 만든다.
// 필드는 String name; int age;
// 생성자를 통해 필드를 초기화

class People {
	
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		// Scanner 로 사람수(peopleCount)를 입력받아 
		// 사람수 만큼 클래스배열을 만들고
		// 이름과 나이를 (반복문) 입력받아 배열의 각 요소에 저장하고 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람수를 입력 : ");
		int peopleCount = scan.nextInt();
		
		People[] pp = new People[peopleCount]; //클래스배열 생성
							// peopleCount 수만큼 배열생성
		
		for(int i = 0; i < pp.length; i++) {
			
			System.out.print(i+1 + "번째 사람의 이름 : ");
			String name = scan.next();
			System.out.print(i+1 + "번째 사람의 나이 : ");
			int age = scan.nextInt();
			
			pp[i] = new People(name, age);
			// 객체를 생성해서 사용할 수 있게 한다.
		}
		
		for(int i = 0; i < pp.length; i++) {
			
			System.out.println(i+1 + "번째 사람의 이름은 " + pp[i].name);
			System.out.println(i+1 + "번째 사람의 나이는 " + pp[i].age);
			
		}
		scan.close();

	}

}






