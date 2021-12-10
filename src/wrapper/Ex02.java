package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		// 포장객체 비교
		System.out.println(obj1 == obj2);
		
		// 데이터 비교
		System.out.println(obj1.equals(obj2));
		// equals() 메소드는 Object 클래스의 메소드이다.
		// wrapper 클래스는 Object 의 equals 메소드를 재정의해서
		// 안에있는 데이터(값)를 비교한다.
		
	}

}
