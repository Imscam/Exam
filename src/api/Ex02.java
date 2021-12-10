package api;

// Member 클래스를 만든다.
// Member 클래스의 필드는 String name; int age; String number; 이다.
// 생성자의 매개값으로 필드초기화 해준다.
// equals hashCode toString 메소드 오버라이딩하여 재정의 해보자 

class Member {
	
	String name; 
	int age; 
	String number;
	
	public Member(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			boolean bool = this.name.equals(member.name)
					&& this.age == member.age
					&& this.number.equals(member.number);
			return bool;
			
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return (name + age + number).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n전화번호 : " + number;
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Member member1 = new Member("홍길동", 20, "010-1111-2222");
		Member member2 = new Member("홍길동", 20, "010-1111-3333");
		Member member3 = new Member("홍길동", 20, "010-1111-2222");
		
		System.out.println(member1.equals(member2)); // false
		System.out.println(member1.equals(member3)); // true
		
		System.out.println(member1.hashCode());
		System.out.println(member3.hashCode());
		
		System.out.println(member1.toString());

	}

}
