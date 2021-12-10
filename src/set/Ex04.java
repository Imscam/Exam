package set;

import java.util.*;

// Person 클래스를 만든다.
// 필드는 String name; int age; 
// 생성자 매개값으로 필드초기화
// equals hashCode 오버라이딩해서 재정의 

class Person {
	
	String name; 
	int age; 
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name)
					&& this.age == person.age;
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("성춘향", 21));
		set.add(new Person("이순신", 22));
		set.add(new Person("이몽룡", 20));
		set.add(new Person("홍길동", 20)); // 중복 허용안됨
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<Person> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			Person person = setIter.next();
			
			System.out.println(person.name + " : " + person.age);
			
		}
		
	}

}








