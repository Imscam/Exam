package api;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		// Arrays 클래스는 배열을 쓰는데 있어서 편리한 기능을 제공해주는 클래스
		// Math 클래스와 마찬가지로 static 메소드들로 클래스로 편하게 접근 가능하다.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		// 배열복사 copyOf(복사할배열, 길이)
		// 길이만큼 새로운 배열이 만들어지고 복사할 배열의 index 의 0부터 복사가 된다.
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		// index 2부터 3까지의 배열이 복사가 된다. (4는 불포함)
		System.out.println(Arrays.toString(arr3));
		
		int[] array = {3, 5, 1, 6, 2, 7, 4};
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		// sort() 메소드는 전달받은 배열의 모든요소를 오름차순으로 정렬한다.
		System.out.println(Arrays.toString(array));
		

	}

}
