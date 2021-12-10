package condition;

public class Ex02 {

	public static void main(String[] args) {
		// if문을 사용해서 A B C 등급으로 나누어 봅시다.
		
		int a = 85;
		
		if(a < 80) {
			System.out.println("a는 C등급 입니다.");
		}
		
		if(a >= 80 && a < 90) {
			System.out.println("a는 B등급 입니다.");
		}
		
		if(a >= 90 && a <= 100) {
			System.out.println("a는 A등급 입니다.");
		}
		
		// if문 만으로도 코드를 작성할 수 있다.
		// 하지만 좀더 편리하게 사용하기 위해 else가 나왔다.
		
		if(a < 80) {
			System.out.println("a는 C등급 입니다.");
		}else if(a < 90) {
			System.out.println("a는 B등급 입니다.");
		}else {
			System.out.println("a는 A등급 입니다.");
		}
		

	}

}
