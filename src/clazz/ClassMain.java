package clazz;

class Person { // 설계도
	// 클래스(설계도) 안에 구성멤버는
	// 필드, 생성자, 메소드
	
	// 필드(속성)
	// (class에 선언된 변수를 필드라고 한다.)
	String name;
	int age;
	
	// 생성자
	public Person() {
		// 생성자는 메소드와 비슷한 모양을 갖고 있지만 
		// 리턴타입이 없고, 클래스명과 똑같다.
	} 
	// 객체를 생성할때 호출이 되서 필드초기화 또는 메소드 호출 등
	// 객체를 사용할 준비를 한다.
	
	// 메소드(기능)
	public void walk() {}
	public void run() {}
	
}


public class ClassMain {

	public static void main(String[] args) {
		
		Person object = new Person();
		// 클래스 변수 = new 생성자; // 생성자는 클래스이름하고 똑같은 메소드이다.
		// Person 클래스(설계도)를 쓰기위한 객체를 생성 
		
	}

}
