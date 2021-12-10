package map;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		// HashMap을 이용해서 아이디하고 비밀번호 입력 <String, String>
		// keySet 메소드로 Set에 key값을 넣어준 뒤 Iterator를 이용해서
		// 아이디와 비밀번호를 출력해보자
		
		Map<String, String> map = new HashMap<>();
		
		map.put("java", "1234");
		map.put("jsp", "5678");
		map.put("database", "qwer");
		map.put("spring", "asdf");
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			String id = keyIter.next();
			String pw = map.get(id);
			
			System.out.println("아이디 : " + id + ", 비밀번호 : " + pw);
			
		}
		

	}

}
