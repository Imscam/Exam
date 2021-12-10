package exception;

public class Ex01 {

	public static void main(String[] args) {
		
		//system.out.println();
		// 컴파일에러 : 컴파일 자체가 안됨
		// 자바컴파일러 : 번역(구문체크)
		
		//System.out.println(args[0]);
		// 실행에러 : 실행중 발생
		
		try {
			System.out.println(args[0]);
			// 예외가 발생할 가능성이 있는 문장들을 넣는다.
			
		}catch(Exception e) {
			System.out.println("예외가 발생!");
			// 예외처리를 위한 문장을 넣는다.
		}finally {
			// 예외의 발생여부에 관계없이 항상 수행되어야 하는 문장을 넣는다.
		}
		
		
		
	}

}
