package inner;

// Inner 클래스에서 Outer 클래스멤버 접근예제

class Outer1 {
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class Inner1 {
		
		private int y = 300;
		//private static z = 400;
		// 인스턴스 멤버클래스에서 정적멤버(static)은 만들 수 없다.
		
		public void disp() {
			System.out.println("Outer x : " + x);
			System.out.println("Inner y : " + y);
			System.out.println("Outer y : " + Outer1.y);
			outerMethod1();
			outerMethod2();
		}
		
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		Outer1 outer = new Outer1();
		// 우선 Outer1 클래스 객체를 생성해준다.
		
		Outer1.Inner1 inner = outer.new Inner1();
		// 생성된 객체로 Inner1 클래스 객체생성
		
		inner.disp();
		
		
		
	}

}
