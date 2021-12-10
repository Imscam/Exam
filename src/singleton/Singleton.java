package singleton;

public class Singleton {
	
	// 정적필드
	private static Singleton singleton = new Singleton();
	// 필드를 외부접근이 불가능하게 private으로 한 후
	// 자기 자신에 대한 객체를 생성한다.
	
	// 생성자
	private Singleton() {}
	// 객체를 생성하지 못하게 private으로 한다.
	
	// 정적메소드
	public static Singleton getInstance() {
		return singleton;
	}
	// public 정적메소드로 클래스로 접근하도록 한다.
	// 오로지 한 객체만 줄 수 있도록 필드를 리턴한다.

}
