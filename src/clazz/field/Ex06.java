package clazz.field;

class Car4 {
	
	private int speed; // 필드를 바로 접근불가능
	// private 은 외부접근 허용안됨 // 데이터보호를 위해사용
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return;
		}else {
			this.speed = speed;
		}
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		
		Car4 car = new Car4();
		
		//car.speed = 100; // 접근불가능
		
		car.setSpeed(-100);
		
		System.out.println(car.getSpeed());
		
	}

}
