package clazz.field;


class FieldEx {
	
	// 필드 field : class에 선언된 변수(멤버변수)
	// 필드와 메소드에 선언된 변수와는 틀리다.
	// (class에 선언된 변수 > 전역변수, method에 선언된 변수 > 지역변수)
	int x = 100;
	String str = "자바";
	
	public void method() {
		String name = "홍길동";
		int age = 20;
		// 지역변수는 메모리의 스택(stack)영역에 저장된다.
		// 스택영역은 메소드의 호출과 함께 할당되며, 메소드의 호출이 완료되면 소멸한다.
		System.out.println("메소드(지역변수) name : " + name);
		System.out.println("메소드(지역변수) age : " + age);
	}
	
	public void disp() {
		//필드(전역변수)는 전체에서 사용 가능하다.
		System.out.println("필드(전역변수) x : " + x);
		System.out.println("필드(전역변수) str : " + str);
		//System.out.println(name);
		//System.out.println(age);
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		FieldEx ex = new FieldEx(); //객체생성
		
		// 객체사용 > 객체이름.필드
		System.out.println(ex.x);
		System.out.println(ex.str);
		
		// 객체사용 > 객체이름.메소드명();
		ex.method();
		ex.disp();
		

	}

}
