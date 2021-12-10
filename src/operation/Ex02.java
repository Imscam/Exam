package operation;

public class Ex02 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		
		int result1 = a + b * c - d; //답은?
		System.out.println("10 + 20 * 30 - 40 : " + result1);
		// 산술연산식에서 뎃셈 뺄셈 연산자 보다는 
		// 곱셈 나눗셈이 우선처리
		
		boolean result2 = a < b && c > d;
		System.out.println("10 < 20 && 30 > 40 : " + result2);
		// && 보다는 <,> 의 우선순위가 높다.
		
		boolean result3 = a < b && c < d;
		System.out.println("10 < 20 && 30 < 40 : " + result3);
		// && : 피연산자가 모두 true일때 true
		
		boolean result4 = a > b || c < d;
		System.out.println("10 > 20 || 30 < 40 : " + result4);
		// || : 피연산자 중 하나만 true이면 true
		
		// 비트연산자
		
		// 10은 ... 0 0 0 0 1 0 1 0 
		//  7은 ... 0 0 0 0 0 1 1 1 
		//  &는 ... 0 0 0 0 0 0 1 0 
		System.out.println(10 & 7); // 2
		
		// 10은 ... 0 0 0 0 1 0 1 0 
		//  7은 ... 0 0 0 0 0 1 1 1 
		//  |는 ... 0 0 0 0 1 1 1 1
		System.out.println(10 | 7); //15
		
		// 10은 ... 0 0 0 0 1 0 1 0 
		//  7은 ... 0 0 0 0 0 1 1 1 
		//  ^는 ... 0 0 0 0 1 1 0 1 
		System.out.println(10 ^ 7); //13
		
		
	}

}



