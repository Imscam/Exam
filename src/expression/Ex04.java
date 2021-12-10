package expression;

import java.util.Scanner;
import java.util.regex.Pattern;

class Profile {
	
	String name;
	int age;
	String number;
	String email;
	
	public Profile(String name, int age, String number, String email) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
	}
	
	public void disp() {
		System.out.println(name + "님의 프로필 정보");
		System.out.println("나이 : " + age + "살");
		System.out.println("전화번호 : " + number + "번");
		System.out.println("이메일 : " + email);
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		// Scanner를 이용해서 이름 나이 전화번호 이메일을 입력받자
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("프로필을 등록합니다.");
		System.out.println();
		
		System.out.print("한글 이름 입력 : ");
		String name = scan.next();
		
		System.out.println("성인나이 20살부터 100살까지 입력하세요");
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		System.out.println("예 : 010-1111-2222");
		System.out.print("전화번호 입력 : ");
		String number = scan.next();
		
		System.out.println("예 : abc@naver.com");
		System.out.print("이메일 입력 : ");
		String email = scan.next();
		
		// 이름 전화번호 이메일은 정규표현식을 사용해서 
		// 올바르게 입력받았는지 알아보자
		// 나이는 입력받고 if문으로 20살부터 100살까지 유효성검사를 해보자 
		
		boolean nameCheck = Pattern.matches("^[가-힣]*$", name);
		
		boolean ageCheck;
		
		if(age < 20 || age > 100) {
			ageCheck = false;
		}else {
			ageCheck = true;
		}
		
		boolean numberCheck = Pattern.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$", number);
		
		boolean emailCheck = Pattern.matches("^\\w+@\\w+\\.\\w+(\\.\\w+)?$", email);
		
		if(nameCheck == false) {
			System.out.println("이름을 잘못입력 하였습니다.");
		}
		
		if(ageCheck == false) {
			System.out.println("나이를 잘못입력 하였습니다.");
		}
		
		if(numberCheck == false) {
			System.out.println("전화번호를 잘못입력 하였습니다.");
		}
		
		if(emailCheck == false) {
			System.out.println("이메일을 잘못입력 하였습니다.");
		}
		
		if(nameCheck == true && ageCheck == true 
				&& numberCheck == true && emailCheck == true) {
			
			Profile profile = new Profile(name, age, number, email);
			
			System.out.println("프로필이 정상적으로 등록되었습니다.");
			
			profile.disp();
			
			
		}else {
			System.out.println("프로필이 등록되지 않았습니다.");
		}
		
		scan.close();
		
		
	}

}
