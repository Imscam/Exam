package quiz;

public class Ex01 {
	
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
