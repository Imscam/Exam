package method;

public class Ex05 {
	
	// 메소드 오버로딩
	// 매개변수 타입, 갯수, 순서중 하나가 달라야 한다.
	
	public static void profile(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void profile(String name, int age, String number) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + number);
	}

	public static void main(String[] args) {
		
		profile("홍길동");
		System.out.println();
		profile("홍길동", 20);
		System.out.println();
		profile("홍길동", 20, "010-1111-2222");
		
		
	}

}
