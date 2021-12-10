package interface1;

import java.util.Scanner;

class Person {
	
	private String name;
	private int age;
	private String number;
	private String address;
	
	// 생성자를 만들어서 매개변수를 받아 필드초기화
	// 필드를 출력해주는 disp 메소드를 만들어보자
	
	public Person(String name, int age, String number, String address) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
	}
	
	public void disp() {
		System.out.println(name + "님의 나이는 : " + age);
		System.out.println(name + "님의 전화번호는 : " + number);
		System.out.println(name + "님의 주소는 : " + address);
	}
	
}

interface PersonService {
	
	public abstract void view(Person[] person);
	public abstract Person[] insert(int personSu);
	
}

class PersonServiceImpl implements PersonService {
	
	Scanner scan;
	
	public PersonServiceImpl() {
		scan = new Scanner(System.in);
	}

	@Override
	public void view(Person[] person) {
		// Person 배열을 받아서 출력해주는 메소드
		for(int i = 0; i < person.length; i++) {
			person[i].disp();
		}
		
	}

	@Override
	public Person[] insert(int personSu) {
		// personSu를 받아서 Person 배열을 생성한 후
		// Person 정보(이름, 나이, 전화번호, 주소)를 Scanner로 입력받아
		// Person 객체를 만든 후 배열의 각 요소에 저장 후 배열을 리턴해주는 메소드
		
		Person[] person = new Person[personSu];
		
		for(int i = 0; i < person.length; i++) {
			
			System.out.println(i+1 + "번째 사람의 정보를 입력하세요");
			
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.print("나이 입력 : ");
			int age = scan.nextInt();
			System.out.print("전화번호 입력 : ");
			String number = scan.next();
			System.out.print("주소 입력 : ");
			String address = scan.next();
			
			person[i] = new Person(name, age, number, address);
			
		}
		
		return person;
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람수를 입력 : ");
		int personSu = scan.nextInt();
		
		
		PersonService ps = new PersonServiceImpl();
		
		Person[] person = ps.insert(personSu);
		
		ps.view(person);
		
		scan.close();
		
	}

}






