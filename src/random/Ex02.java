package random;

public class Ex02 {

	public static void main(String[] args) {
		// 배열과 random() 메소드로 로또추첨 만들기
		
		int[] lotto = new int[6];
		
		System.out.println("로또 추첨을 시작합니다.");
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) +1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		

	}

}
