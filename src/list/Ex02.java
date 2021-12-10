package list;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// String 타입의 ArrayList를 생성한 후
		// 자신이 좋아하는 연예인 5명 이름을 넣어보자
		// 이름을 향상된 for문과 일반 for문으로 출력해보자 
		
		List<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("강호동");
		list.add(0, "엄기준");
		list.add("김소현");
		list.add("이지아");
		
		list.set(2, "조세호");
		
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}

	}

}
