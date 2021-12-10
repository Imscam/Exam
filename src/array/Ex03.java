package array;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
//		System.out.println(intArray[4]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intArray[i]); // i : 제어변수
		}
		
		System.out.println("배열의 길이는? : " + intArray.length);
		// 배열의 길이를 구하는 방법 >> 배열변수.length
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]); 
		}
		

	}

}
