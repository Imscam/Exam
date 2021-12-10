package clazz.field;

class Car3 {
	
	String color;
	int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}


public class Ex05 {

	public static void main(String[] args) {
		
		Car3 car = new Car3();
		// 바로 필드로 접근
		car.color = "빨강";
		car.speed = -100;
		System.out.println(car.color);
		System.out.println(car.speed);
		// 필드로 바로 접근 시 문제가 될 수 있다.
		
		// 메소드를 통해서 접근
		car.setColor("파랑");
		car.setSpeed(-100);
		System.out.println(car.getColor());
		System.out.println(car.getSpeed());
		
	}

}
