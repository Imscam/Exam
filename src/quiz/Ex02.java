package quiz;

import java.util.Scanner;

// Name 클래스를 만들고 필드는 String name; 이다.
// 필드를 외부접근 금지가 되게 하고 get set  메소드를 만든다.
// 생성자를 만들어 필드초기화하자 (생성자의 매개값으로)

class Name {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Name(String name) {
		this.name = name;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// Scanner 로 이름을 입력받아 Name 클래스의 인스턴스(객체)를 만든다.\
		// get 메소드로 이름을 출력하고 
		// set 메소드로 이름을 다시 수정해보자 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name = scan.next();
		
		Name myName = new Name(name);
		
		System.out.println("이름은 : " + myName.getName() + " 입니다.");
		
		System.out.println("이름을 수정합니다.");
		
		System.out.println("현재이름은 : " + myName.getName() + " 입니다.");
		System.out.print("수정할 이름 : ");
		String newName = scan.next();
		
		myName.setName(newName);
		System.out.println("이름이 수정되었습니다.");
		System.out.println("수정된 이름 : " + myName.getName() + " 입니다.");
		
		scan.close();
		
		
	}

}






