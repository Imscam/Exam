package list;

import java.util.*;

// Student 클래스를 만든다.
// 필드는 int studentID; String name; String department;
// 생성자를 통해 초기화를 하고 disp 메소드로 학번, 이름, 학과를 출력해보자 

class Student {
	
	int studentID; 
	String name; 
	String department;
	
	public Student(int studentID, String name, String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;
	}
	
	public void disp() {
		System.out.println("학번 : " + studentID + "|| 이름 : " 
				+ name + "|| 학과 : " + department);
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(202101, "홍길동", "컴퓨터"));
		list.add(new Student(202105, "이순신", "무역"));
		list.add(new Student(202107, "성춘향", "요리"));
		
		// 일반 for문 향상된 for문 그리고 Iterator를 사용해서 학번,이름,학과를 출력
		
		for(int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			stu.disp();
		}
		System.out.println();
		
		for(Student stu : list) {
			stu.disp();
		}
		System.out.println();
		
		Iterator<Student> iter = list.iterator();
		
		while(iter.hasNext()){
			Student stu = iter.next();
			stu.disp();
		}
		
		
	}

}






