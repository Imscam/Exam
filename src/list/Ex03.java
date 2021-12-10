package list;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		Iterator<String> iter = list.iterator(); //반복자
		// 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
		// Iterator 객체는 컬렉션 객체의 iterator 메소드를 호출해서 얻어올수 있다.
		
		while(iter.hasNext()) {// 요소(객체)가 있는지 확인 후 true, false 리턴
			
			 String str = iter.next(); //요소를 하나씩 가져온다.
			 System.out.println(str);
		}
		System.out.println();
		
		iter = list.iterator();
		// Iterator는 1회성이다. 필요하면 다시 객체를 얻어와야 한다.
		
		while(iter.hasNext()) {
			
			String str = iter.next(); 
			System.out.println(str);
			iter.remove(); // 컬렉션에 저장된 요소들을 지운다.
		}
		
		System.out.println(list.isEmpty());
		

	}

}







