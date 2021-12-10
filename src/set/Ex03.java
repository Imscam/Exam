package set;

import java.util.*;

class SimpleNumber {
	
	int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	// Integer, String 등과 같이 JDK 에서 제공해주는 객체가 아닌
	// 우리가 직접 만드는 객체에서 equals 메소드를 오버라이딩 하지않고 사용하면
	// 그냥 '==' 연산자를 사용하는 것과 같다는 것이 되어버린다.
	// equals() 와 hashCode() 오버라이딩해서 재정의 할 것 !
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber) {
			SimpleNumber number = (SimpleNumber)obj;
			boolean bool = (number.num == this.num);
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber> set = new HashSet<>();
		
		set.add(new SimpleNumber(30));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(30));
		
		
		System.out.println("저장된 데이터 수 : " + set.size());
		
		Iterator<SimpleNumber> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			SimpleNumber number = setIter.next();
			System.out.println(number.num);
			
			
		}
		
		
	}

}




