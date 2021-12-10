package string;

public class Ex03 {

	public static void main(String[] args) {
		// String 생성자로 String 객체 생성하기
		
		// 배열 전체를 String 객체로 생성하기
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// 배열의 인덱스 위치부터 length만큼 String 객체로 생성하기
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		// 문자열을 byte 배열로 반환
		String str3 = "Hello Java";
		byte[] byteArray = str3.getBytes();
		
		for(byte by : byteArray) {
			System.out.print(by + "  ");
		}
		
		

	}

}
