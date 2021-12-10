package map;

import java.util.*;

// ProfileInfo 클래스를 만든다.
// 필드는 String address; String number; 로 하고
// 생성자를 통해 초기화

class ProfileInfo {
	
	String address; 
	String number;
	
	public ProfileInfo(String address, String number) {
		this.address = address;
		this.number = number;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		// HashMap을 이용해서 키값은 <String> (이름) 
		// value값은 ProfileInfo 로 한다.
		// put 메소드로 3명의 키와 value를 넣고
		// key 값을 이용해서 value를 출력해보자 
		
		Map<String, ProfileInfo> map = new HashMap<>();
		
		map.put("홍길동", new ProfileInfo("종로3가", "010-1111-2222"));
		map.put("이순신", new ProfileInfo("강남", "010-1111-3333"));
		map.put("성춘향", new ProfileInfo("노량진", "010-1111-4444"));
		
		ProfileInfo profile1 = map.get("홍길동");
		
		System.out.println("홍길동의 연락처");
		System.out.println("주소 : " + profile1.address);
		System.out.println("전화번호 : " + profile1.number);
		System.out.println();
		
		ProfileInfo profile2 = map.get("이순신");
		System.out.println("이순신의 연락처");
		System.out.println("주소 : " + profile2.address);
		System.out.println("전화번호 : " + profile2.number);
		System.out.println();
		
		ProfileInfo profile3 = map.get("성춘향");
		System.out.println("성춘향의 연락처");
		System.out.println("주소 : " + profile3.address);
		System.out.println("전화번호 : " + profile3.number);
		
	}

}






