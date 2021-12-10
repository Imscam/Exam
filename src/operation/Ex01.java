package operation;

public class Ex01 {

	public static void main(String[] args) {
		
		int i, j;
		
		i = +100; //부호연산자
		j = -200;
		System.out.println(i + j); //산술연산자
		
		// 증감연산자의 독립사용일때
		int x = 1, y = 1;
		
		x++; //1증가
		y = x;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
		
		++x; //1증가
		y = x;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
		
		
		x = y = 1;
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
		
		// 증감연산자의 독립사용이 아닐 때
		
		y = ++x;
		// 연산과정 : x를 1증가 후 y = x 를 실행
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
		
		y = x++;
		// 연산과정 : y = x 를 실행 후 x를 1증가
		System.out.printf("결과 >> x : %d, y : %d\n\n", x, y);
		

	}

}
