package inheritance;

/*final*/ class Suv {
	
	private String color;
	
	int speed = 100;
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
	// 부모클래스의 private 접근제한을 갖는
	// 필드 및 메소드는 자식이 물려받을 수 없다.
	// 부모와 자식클래스가 서로 다른패키지에 있다면,
	// 부모의 default 접근제한을 갖는 필드 및 메소드도 
	// 자식이 물려받을 수 없다.
	// 그 이외의 경우는 모두 상속의 대상이 된다.
	
}

class Santafe extends Suv {
	
	int speed = 120;
	
	@Override
	public void run() { // 재정의 메소드
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	public void disp() {
		super.run(); //부모메소드 호출
		System.out.println("SUV 속도 : " + super.speed); //부모필드
		
		this.run(); //자식메소드 호출
 		System.out.println("싼타페 속도 : " + this.speed); //자식필드
	}
	
	// 부모클래스에서 상속받은 멤버필드의 이름과 자식클래스에서 만든 멤버필드의 이름이 같을경우
	// 부모클래스의 멤버를 사용하기 위해서는 super 라는 키워드를 사용해야 한다.
	// 자식클래스는 this 가 생략되어 있어서 그냥 사용하면 자식클래스의 멤버가 사용된다.
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		
		santafe.disp();

	}

}
