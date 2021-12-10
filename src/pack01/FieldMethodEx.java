package pack01;

public class FieldMethodEx {
	
	public String str1 = "public 필드";
	
	protected String str2 = "protected 필드";
	
	String str3 = "default 필드";
	
	private String str4 = "private 필드";
	
	public void method1() {
		System.out.println("public 메소드");
	}
	protected void method2() {
		System.out.println("protected 메소드");
	}
	void method3() {
		System.out.println("default 메소드");
	}
	private void method4() {
		System.out.println("private 메소드");
	}
	
	public static void main(String[] args) {
		
		// 같은 클래스 안에선 모두 사용가능
		FieldMethodEx ex = new FieldMethodEx();
		
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		System.out.println(ex.str4);
		System.out.println();
		ex.method1();
		ex.method2();
		ex.method3();
		ex.method4();
		
		
	}

}





