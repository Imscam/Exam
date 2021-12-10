package set;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		// Set : 데이터를 중복저장 하지않음
		// HashSet 클래스는 내부에 있는 해쉬테이블을 사용 저장한다.
		// 데이터의 저장순서를 유지하지 않는다.
		// 데이터의 중복저장을 허용하지 않는다.
		
		Set<String> set = new HashSet<>();
		
		set.add(new String("홍길동"));
		// 원칙 : new 연산자를 이용해서 객체를 넣는다.
		set.add("이순신");
		set.add("홍길동"); // set에 중복값 저장불가능
		set.add("성춘향");
		set.add("이몽룡");
		
		System.out.println("Set 크기 : " + set.size());
		
		Iterator<String> setIter = set.iterator(); //Set을 Iterator 안에 담기
		
		while(setIter.hasNext()) { // 값이 있는지 확인 후 있으면 true, 없으면 false 리턴
			
			String str = setIter.next();
			System.out.println(str);
			
		}
		System.out.println();
		
		set.remove("홍길동"); // 값 제거
		
		setIter = set.iterator(); // 반복자 재생성
		
		while(setIter.hasNext()) { 
			String str = setIter.next();
			System.out.println(str);
		}
		
		set.clear(); //전체삭제
		
		if(set.isEmpty()) { // 값이 비어있으면 true 반환
			System.out.println("비어 있음");
		}
		

	}

}
