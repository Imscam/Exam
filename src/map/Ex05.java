package map;

import java.util.*;

// Food 클래스를 만들고
// 필드는 private String food; 로 한다.
// 생성자를 통해 초기화를 하고 필드를 리턴하는 get 메소드를 만든다.
// Object 클래스의 equals 메소드와 hashCode 메소드를 
// 오버라이딩하여 재정의 해보자 

class Food {
	
	private String food;
	
	public Food(String food) {
		this.food = food;
	}
	
	public String getFood() {
		return food;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Food) {
			Food f = (Food)obj;
			return f.food.equals(this.food);
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return (food).hashCode();
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Map<Food, Integer> map = new HashMap<>();
		
		map.put(new Food("치킨"), 4);
		map.put(new Food("김치찌개"), 6);
		map.put(new Food("짜장면"), 7);
		map.put(new Food("볶음밥"), 10);
		map.put(new Food("치킨"), 7);
		
		System.out.println(map.size());
		
		Set<Food> keySet = map.keySet();
		
		Iterator<Food> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Food food = keyIter.next();
			int number = map.get(food);
			
			System.out.println("내가 한달에 먹는 음식");
			System.out.println(food.getFood() + " : " + number);
			
		}
		
		
		
	}

}





