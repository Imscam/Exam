package expression;

import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {
		
		String pattern = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
		String number = "010-1234-5678";
		
		if(Pattern.matches(pattern, number)) {
			System.out.println("올바른 전화번호 형식입니다.");
		}else {
			System.out.println("올바른 전화번호 형식이 아닙니다.");
		}
		
		String pattern2 = "[가-힣]*";
		String koreaName = "홍길동";
		
		if(Pattern.matches(pattern2, koreaName)) {
			System.out.println("올바른 한글이름 입니다.");
		}else {
			System.out.println("올바르지 않은 한글이름 입니다.");
		}
				

	}

}
