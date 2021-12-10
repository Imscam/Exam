package inheritance;

class Car {
	
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(Car클래스) : " + this.speed);
	}
	
}

// Car 클래스를 상속받은 Genesis 클래스를 만들어
// upSpeed 메소드를 재정의해보세요
// speed 필드로 저장할 수 있는 속도는 최고속도(150까지만) 

class Genesis extends Car {
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 150) {
			this.speed = 150;
		}
		System.out.println("현재속도(Genesis클래스) : " + this.speed);
	}
	
	
}

//Car 클래스를 상속받은 Porter 클래스를 만들어
//upSpeed 메소드를 재정의해보세요
//speed 필드로 저장할 수 있는 속도는 최고속도(100까지만) 

class Porter extends Car {
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 100) {
			this.speed = 100;
		}
		System.out.println("현재속도(Porter클래스) : " + this.speed);
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Genesis genesis = new Genesis();
		Porter porter = new Porter();
		
		car.upSpeed(200);
		genesis.upSpeed(200);
		porter.upSpeed(200);
		

	}

}
