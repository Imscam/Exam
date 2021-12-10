package string;

public class Ex05 {

	public static void main(String[] args) {
		
		// startsWith : 문자열이 지정한 문자로 시작하는지 판단 후
		// 같으면 true 반환 아니면 false 반환 (대소문자구별)
		String str = "apple";
		System.out.println("startsWith : " + str.startsWith("a"));
		
		// endsWith : 문자열 마지막에 지정한 문자가 있는지를 판단 후
		// 있으면 true, 없으면 false 반환 (대소문자구별)
		System.out.println("endsWith : " + str.endsWith("e"));
		
		// equals : 두 개의 String에 값만을 비교해서 같으면 true
		// 다르면 false를 반환 (대소문자비교)
		String str1 = "java";
		String str2 = "java";
		System.out.println("equals : " + str1.equals(str2));
		

	}

}
