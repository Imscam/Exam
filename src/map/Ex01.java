package map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(new Integer(1), new String("홍길동"));
		map.put(2, "성춘향");
		map.put(3, "이순신");
		map.put(4, "이몽룡");
		map.put(1, "홍길순");
		
		System.out.println(map.size());
		
		// 전체출력
		System.out.println(map);
		
		System.out.println(map.get(1)); //key를 가지고 value를 출력
		System.out.println(map.get(7));
		// key가 존재하지 않으면 null을 리턴
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<Integer> keySet = map.keySet(); // key를 Set 타입으로 변환
		
		Iterator<Integer> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			int key = keyIter.next();
			String value = map.get(key);
			
			System.out.println("Key : " + key);
			System.out.println("value : " + value);
		}
		System.out.println();
		
		map.remove(1); // key값으로 Entry 삭제
		map.remove(2);
		
		System.out.println(map);
		
		map.clear(); // 전체삭제
		
		if(map.isEmpty()) {
			System.out.println("요소가 비어있습니다.");
		}
		
		

	}

}
