package clazz.field;

class Car {
	
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; // default : 0 (자동으로 초기화 / 기본값이 0이 된다.)
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // 객체생성
		
		// 객체사용
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
	}

}
