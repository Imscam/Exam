package inner;

// 로컬 클래스 예제

class LocalEx {
	
	void mehtod() {
		
		class LocalInner {
			
			int x = 100;
			//static int z = 200; // static은 사용할 수 없다.
			
			public void disp() {
				System.out.println("methodInner x : " + x);
			}
			
		}
		
		LocalInner inner = new LocalInner();
		inner.disp();
		
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		LocalEx inner = new LocalEx();
		
		inner.mehtod();
		
	}

}
