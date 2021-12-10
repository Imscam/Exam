package quiz;

public class Ex01 {

	public static void main(String[] args) {
		
		// 홍길동 통장에는 돈이 1754305원이 있다.
		// 은행을 가서 통장의 돈을 50원의 동전만으로 출금했다.(잔돈은 출금안함)
		// 총 동전의 갯수를 500개씩 묶어서 저금통에 담았다.
		// 저금통에 안들어간 동전의 갯수를 구한다음 그 갯수의 아스키문자를 구하자 
		
		int a = 1754305;
		
		int result = a / 50;
		System.out.println(result);
		
		int result2 = result % 500;
		System.out.println((char)result2);
		
		int x = 0;
		int add = 0;
		
		while(x < 10) {
			
			add += ++x;
		}
		// 다음 while문에서 한줄코드로만 작성해서
		// 1부터 10까지 숫자를 더하는 식을 완성해보자
		System.out.println(add); // 55
		
		

	}

}



