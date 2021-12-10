package clazz.array;

// 클래스(객체) 배열에 대해 알아보자

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void disp() {
		System.out.println(title + " : " + author);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		
		Book[] book = new Book[5]; // 클래스배열 5개 생성
		
		book[0] = new Book("java", "홍길동");
		// 객체를 생성해서 배열의 각 요소에 저장
		book[1] = new Book("jsp", "성춘향");
		book[2] = new Book("database", "이순신");
		book[3] = new Book("javascript", "이몽룡");
		book[4] = new Book("spring", "임꺽정");
		
		for(int i = 0 ; i < book.length; i++) {
			book[i].disp();
			System.out.println();
		}
		
		
	}

}
