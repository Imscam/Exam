package exception;

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1 / 0);
			System.out.println("예외발생시 실행안함!");
			
		}catch(ArithmeticException ae) {
			ae.printStackTrace(); // 에러내용 출력
			System.out.println("메세지 : " + ae.getMessage());
		}
		
		try {
			Exception e = new Exception("예외발생!!!!!");
			// Exception 인스턴스를 생성할때 생성자에 String을 넣어주면
			// 이 String이 Exception 인스턴스에 메세지로 저장된다.
			// 이 메세지는 getMessage() 메소드를 이용해서 얻을 수 있다.
			
			throw e; //예외를 일부러 발생
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("메세지 : " + e.getMessage());
			
		}
		
		
		
		
	}

}
