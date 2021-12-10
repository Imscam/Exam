package print;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.printf("정수 : %d\n", 1);
		System.out.printf("실수 : %f\n", 1.2);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("문자열 : %s\n", "Hello~~Java");
		
		// %문자 : 서식문자 - printf()에서만 사용가능
		// %d : 정수
		// %f : 실수
		// %c : 문자 >> ' '를 쓴다
		// %s : 문자열 >> " "를 쓴다.
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%-5d\n", 123);
		System.out.printf("%.2f\n", 12.1234);
		System.out.printf("%7.2f\n", 12.1234);
		// 서식지정자 안에 %숫자d 로 작성하면 출력시 해당위치에
		// 숫자값 만큼의 공간확보를 하고 값을 출력
		// 실수값을 출력할때 서식지정자안에 %.숫자f 로 작성하면
		// 해당 숫자까지의 소수점 자리를 출력
		

	}

}
