package pack01;

public class ConstructorEx {
	
	// 모든 패키지에서 생성자호출
	public ConstructorEx() {
		System.out.println("public 생성자");
	}
	
	// 같은패키지와 자식클래스에서 생성자호출
	protected ConstructorEx(int a) {
		System.out.println("protected 생성자");
	}
	
	// 같은패키지에 제한없이 생성자호출
	ConstructorEx(int a, int b) {
		System.out.println("default 생성자");
	}
	
	// 오로지 클래스 내부에서만 생성자호출
	private ConstructorEx(int a, int b, int c) {
		System.out.println("private 생성자");
	}
	
	public static void main(String[] args) {
		
		// 같은클래스 내부에서 모두 호출가능
		ConstructorEx ex1 = new ConstructorEx();
		ConstructorEx ex2 = new ConstructorEx(1);
		ConstructorEx ex3 = new ConstructorEx(1, 2);
		ConstructorEx ex4 = new ConstructorEx(1, 2, 3);
		
	}
	

}
