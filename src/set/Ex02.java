package set;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// String 타입의 HashSet 클래스를 생성한 후
		// 과일의 이름을 5개 넣는다.
		// 반복자(Iterator) 를 이용해서 하나씩 출력해보자 
		
		Set<String> set = new HashSet<>();
		
		set.add("수박");
		set.add("복숭아");
		set.add("사과");
		set.add("바나나");
		set.add("딸기");
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			System.out.println(setIter.next());
			
		}
		

	}

}
