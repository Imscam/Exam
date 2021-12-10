package method;

public class Ex06 {
	
	public static int sum1(int... n) { // 매개변수의 수를 모르는경우
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		return sum;
	}
	
	public static int sum2(int[] arr) { // 매개변수를 배열로 받는경우 
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static void change1(int a) {
		a = 100;
	}
	
	public static void change2(int[] arr) {
		arr[0] = 100;
	}

	public static void main(String[] args) {
		
		int sum1 = sum1(1, 2, 3);
		System.out.println(sum1);
		
		int[] intArray = new int[] {1, 2, 3, 4, 5};
		
		int sum2 = sum2(intArray);
		System.out.println(sum2);
		
		int a = 1;
		change1(a);
		// 1의값을 복사해서 넘겼기 때문에 원본의 값은 바뀌지 않는다.
		System.out.println(a);
		
		change2(intArray);
		// 배열의 주소를 보냈기 때문에 배열의 값을 바꾸면 원본배열이 바뀐다.
		System.out.println(intArray[0]);

	}

}
