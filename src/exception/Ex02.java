package exception;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1 / 0); // 0으로 나누기 금지
			System.out.println("실행안됨");
			
		}catch(ArithmeticException ae) {
			System.out.println("예외발생!");
			System.out.println("0으로 나눌 수 없습니다.");
			
		}finally {
			System.out.println("항상실행!!");
		}
	}

}
