package clazz.field;


class Car1 {
	
	// 필드를 메소드로 접근할 수 있다.
	String color;
	int speed;
	
	void upSpeed(int value) { // 메소드
		speed += value; // speed = speed + value;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Car1 myCar1 = new Car1(); //객체생성
		myCar1.color = "빨강";
		myCar1.speed = 30;
		
		Car1 myCar2 = new Car1(); //객체는 여러개 생성할 수 있다.
		myCar2.color = "파랑";
		myCar2.speed = 50;
		
		myCar1.upSpeed(30);
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 : " + myCar1.color);
		System.out.println("자동차1의 속도는 : " + myCar1.speed);
		
		myCar2.upSpeed(50);
		System.out.println("자동차2의 색상은 : " + myCar2.color);
		System.out.println("자동차2의 속도는 : " + myCar2.speed);
		
		
	}

}






