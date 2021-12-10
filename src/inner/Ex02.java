package inner;

// Outer 클래스에서 Inner 클래스멤버 접근예제

class Outer2 {
	
	private int x = 100;
	
	public void disp() {
		
		System.out.println("Outer x : " + x);
		//System.out.println("Inner y : " + y); //에러
		
		Outer2.Inner2 in1 = this.new Inner2();
		// 이런식으로도 접근가능
		System.out.println("Inner y : " + in1.y);
		
		Inner2 in2 = new Inner2();
		System.out.println("Inner y : " + in2.y);
		in2.innerMethod1();
		in2.innerMethod2();
		
	}
	
	class Inner2 {
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public 안쪽클래스 메소드");
		}
		
		private void innerMethod2() {
			System.out.println("private 안쪽클래스 메소드");
		}
		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.disp();

	}

}
