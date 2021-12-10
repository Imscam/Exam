package poly;

// 필드의 다형성

class Car {
	// 필드
	Tire tire = new Tire();
	
}

class Tire {
	
	public String tireName;
	
	public Tire() {
		tireName = "정품타이어";
	}
	
	public String getTireName() {
		return tireName;
	}
	
}

class HankookTire extends Tire {
	
	public HankookTire() {
		tireName = "한국타이어";
	}
	
}

class KumhoTire extends Tire {
	
	public KumhoTire() {
		tireName = "금호타이어";
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Car car = new Car();
		String tireName1 = car.tire.getTireName();
		System.out.println(tireName1);
		
		car.tire = new HankookTire(); // 필드의 다형성 
		String tireName2 = car.tire.getTireName();
		System.out.println(tireName2);
		
		car.tire = new KumhoTire(); //필드의 다형성
		String tireName3 = car.tire.getTireName();
		System.out.println(tireName3);
		
	}

}
