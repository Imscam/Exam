package api;

// 우리가 만든 클래스는 String클래스 같이 equals 메소드가 재정의 되어있지 않다.
// 따라서 Object 클래스의 hashCode() 메소드와 equals() 메소드를
// 오버라이딩하여 재정의 해주어야 한다!

class Person {
	
	private String name;
	private int age;
	private final String SSN;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name)
					&& this.age == person.age
					&& this.SSN.equals(person.SSN);
			return bool;
			
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (name + age + SSN).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n주민번호 : " + SSN;
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 20, "123456-1234567");
		Person person2 = new Person("홍길동", 20, "123456-1234567");
		
		System.out.println(person1.equals(person2)); 
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		System.out.println(person1.toString());
		
	}

}
