package inheritance;

class Parent { //부모클래스
	
	int parentField;
	
	public Parent() {
		System.out.println("부모클래스 생성자입니다.");
	}
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드입니다");
	}
	
}

class Child extends Parent { //자식클래스
	
	int childField;
	
	public Child() {
		super(); //부모생성자가 먼저 호출이된다.(부모객체가 먼저 생성)
		// 첫줄에만 올 수 있다.
		System.out.println("자식클래스 생성자입니다.");
	}
	
	public void childMethod() {
		System.out.println("자식클래스 메소드입니다.");
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Child child = new Child(); //자식클래스 객체생성 
		
		child.childField = 20; //자식필드
		System.out.println(child.childField);
		
		child.parentField = 50; //부모필드
		System.out.println(child.parentField);
		
		child.childMethod(); //자식 메소드호출
		child.parentMethod(); //부모 메소드호출

	}

}




