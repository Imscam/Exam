package modifier;

public class Ex02 {
	
	int x = 100; //인스턴스 멤버변수
	static int y = 200; //정적 멤버변수
	
	// 정적 메소드
	public static void disp() {
		
		//System.out.println(x);
		// 정적메소드는 내부에 인스턴스 필드나 메소드를 사용할 수 없다.
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		
		Ex02 ex = new Ex02();
		ex.disp();
		// 정적메소드는 원칙적으로 클래스이름으로 접근
		// 객체로 접근시 이클립스에서 경고표시
		Ex02.disp();

	}

}
