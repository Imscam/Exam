package generic;

class Box<E> {
	
	private E obj;
	
	public E getObj() {
		return obj;
	}
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		//Box box = new Box();
		//box.setObj("안녕하세요");
		//String str = (String)box.getObj();
		//System.out.println(str);
		
		//box.setObj(100);
		//int num = (Integer)box.getObj();
		//System.out.println(num);
		
		Box<String> box = new Box<String>();
		
		box.setObj("안녕하세요");
		String str = box.getObj();
		System.out.println(str);
		
		
		
	}

}
