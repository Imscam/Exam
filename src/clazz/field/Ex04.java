package clazz.field;

class Car2 {
	
	String color;
	int speed;
	
	void setSpeed(int speed) { // set > 저장하다
		this.speed = speed;
		// 매개변수와 필드의 이름이 동일하기 때문에
		// (this.필드)는 this 라는 참조변수로 필드를 사용
	}
	
	int getSpeed() { //get > 가져오다, 얻다
		return speed; // int speed 필드를 리턴한다.
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car2 car = new Car2();
		
		// 필드로 바로접근
		car.color = "빨강";
		car.speed = 30;
		System.out.println("색상은 : " + car.color);
		System.out.println("속도는 : " + car.speed);
		
		// 필드를 메소드로 접근
		car.setColor("파랑");
		car.setSpeed(50);
		System.out.println("색상은 : " + car.getColor());
		System.out.println("속도는 : " + car.getSpeed());
		
		
		
	}

}
