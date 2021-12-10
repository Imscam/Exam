package expression;

import java.util.regex.Pattern;

public class Ex01 {

	public static void main(String[] args) {
		
		String str = "123456";
		String pattern = "^[0-9]*$";
		
		if(Pattern.matches(pattern, str)) {
			System.out.println("숫자만 포함되어 있습니다.");
		}else {
			System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
		}

	}

}
