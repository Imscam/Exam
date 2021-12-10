package expression;

import java.util.regex.Pattern;

public class Ex02 {

	public static void main(String[] args) {
		
		String pattern = "\\w+\\@\\w+.\\w+(.\\w+)?";
		String email = "abc@naver.com";
		
		if(Pattern.matches(pattern, email)) {
			System.out.println("올바른 이메일 형식입니다.");
		}else {
			System.out.println("올바른 이메일 형식이 아닙니다.");
		}
		

	}

}
