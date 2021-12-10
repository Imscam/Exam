package map;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// HashMap을 이용해서 과목하고 성적을 입력
		// 과목 : 국어 영어 수학 자바
		// 과목은 <String> 성적은 <Integer>
		// Key값을 이용해서 value를 출력해보자 
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 88);
		map.put("영어", 95);
		map.put("수학", 77);
		map.put("자바", 90);
		
		int kor = map.get("국어");
		System.out.println("국어의 점수는 : " + kor);
		
		int eng = map.get("영어");
		System.out.println("영어의 점수는 : " + eng);
		
		int math = map.get("수학");
		System.out.println("수학의 점수는 : " + math);
		
		int java = map.get("자바");
		System.out.println("자바의 점수는 : " + java);
		
		// 성적의 배열을 만들고 오름차순으로 정렬해보자 
		// sort() 메소드 사용
		
		int[] sungJuk = {kor, eng, math, java};
		System.out.println(Arrays.toString(sungJuk));
		
		Arrays.sort(sungJuk);
		
		System.out.println(Arrays.toString(sungJuk));
		

	}

}





