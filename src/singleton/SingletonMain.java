package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton();
		// 객체 생성이 안됨
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		if(sing1 == sing2) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}

	}

}
