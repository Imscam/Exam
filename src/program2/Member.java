package program2;

public class Member {
	
	private String name;
	private int age;
	private String phoneNum;
	
	public Member(String name, int age, String phoneNum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	// get set 메소드 만들기
	// equals hashCode 오버라이딩 재정의
	// 필드 출력해주는 disp() 메소드 만들기 
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			boolean bool = this.name.equals(member.name)
					&& this.age == member.age
					&& this.phoneNum.equals(member.phoneNum);
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (name + age + phoneNum).hashCode();
	}
	
	public void disp() {
		System.out.println(name + "회원 || " + age + "살 || " + phoneNum + "번");
	}
	
	
	
	
	

}






