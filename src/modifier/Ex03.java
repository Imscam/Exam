package modifier;

public class Ex03 {
	
	static {
		System.out.println("static 블록");
	}
	
	{
		System.out.println("인스턴스 블록");
	}
	
	public Ex03() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
	
		System.out.println("메인메소드 시작!");
		
		Ex03 ex1 = new Ex03();
		
		System.out.println("------------");
		
		Ex03 ex2 = new Ex03();
		
		System.out.println("메인메소드 끝!");

	}

}
