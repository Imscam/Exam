package modifier;

class Box {
	
	static int boxID = 0;
	// static : 메모리상의 정적이다.
	// 프로그램 시작시 메모리의 메소드영역(최상단)에 할당된다.
	// 공유되는 전역변수
	
	int idNum = 0;
	// 인스턴스 변수
	
	public void increase() {
		boxID++;
		idNum++;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("idNum : " + box1.idNum); // 1
		System.out.println("boxID : " + box1.boxID); // 1
		
		box2.increase();
		System.out.println("idNum : " + box2.idNum); // 1
		System.out.println("boxID : " + box2.boxID); // 2
		
		box3.increase();
		System.out.println("idNum : " + box3.idNum); // 1
		System.out.println("boxID : " + box3.boxID); // 3
		
		// 인스턴스 변수는 객체마다 공유되지 않는다.
		// static 변수는 모든 객체가 공유된다.
		System.out.println();
		System.out.println("boxID : " + Box.boxID);
		// 정적필드는 원칙적으로 클래스명으로 접근 
		
		
		
	}

}







