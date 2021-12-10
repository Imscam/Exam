package loop1;

public class Ex09 {

	public static void main(String[] args) {
		
		// 별찍기 만들기
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
