package loop2;

public class Ex11 {

	public static void main(String[] args) {
		// while문을 이용해서 1 ~ 10까지 합을 구하기
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1에서 10까지의 합 : " + sum);

	}

}
