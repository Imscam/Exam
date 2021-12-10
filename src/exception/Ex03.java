package exception;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1 / 0);
			//System.out.println(args[0]);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("ArithmeticException 예외발생");
			
		}catch(Exception e) { // ArithmeticException 제외한 모든 예외처리
			// Exception은 모든 예외를 처리할 수 있다.
			// 제일 마지막에 와야한다.
			System.out.println("Exception 예외발생");
			
		}
		
		
	}

}
