package exception;

public class Ex05 {
	
	
	public static void call(int j) throws ArrayIndexOutOfBoundsException{
								// throws는 호출한 곳에서 예외처리
		int[] i = {1, 2, 3};
		System.out.println(i[j]);
	}
	
	public static void main(String[] args) {
		
		try {
			call(5); // call 메소드 호출
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기에 맞는 값을 입력하세요!");
			e.printStackTrace(); //에러내용 출력
		}finally {
			System.out.println("해당 문장은 항상수행");
		}
	}

}
