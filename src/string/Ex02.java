package string;

public class Ex02 {

	public static void main(String[] args) {
		// 자바에서 문자열을 기본타입으로 변환하는 방법
		
		String str = "10";
		
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		
		str = "10.123";
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));
		
		
		

	}

}
