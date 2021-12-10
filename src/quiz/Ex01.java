package quiz;

public class Ex01 {
<<<<<<< HEAD
	
	// 정수배열을 받아서 1 ~ 10까지 난수를 채워주는 메소드를 만들어보자
	
	public static void randomSu(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 10) + 1;
			
		}
		
	}

	public static void main(String[] args) {
		
		// 길이가 5인 정수배열을 선언하고 메소드를 호출해서 난수를 얻은 다음
		// 반복문으로 배열을 출력해보자 
		
		int[] array = new int[5];
		
		randomSu(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(i+1 + "번째 난수 : " + array[i]);
		}
		
	}

}
=======

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



>>>>>>> refs/remotes/origin/master
