package loop1;

public class Ex04 {

	public static void main(String[] args) {
		// 0부터 90까지 10단위로 출력해보자
		// 0, 10, 20, 30...., 80, 90
		
		for(int i = 0; i <= 90; i += 10) {
			if(i != 90) {
				System.out.printf("%d, ", i);
			}else {
				System.out.print(i);
			}
		}

	}

}
