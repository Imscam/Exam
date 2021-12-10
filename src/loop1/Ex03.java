package loop1;

public class Ex03 {

	public static void main(String[] args) {
		// for문을 사용해서 1에서 10까지 합을 구해보자
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("1에서 10까지의 합 : " + sum);

	}

}
