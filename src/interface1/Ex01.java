package interface1;

// 인터페이스(interface)
// 1. 추상클래스보다 훨씬 극단적이고 제한적인 성격을 갖는다.
// 2. 멤버필드와 추상메소드만 정의 할 수 있다.
// 3. 상속받으려면 extends 를 사용하면 안되고 implements 를 사용하여야 한다.
// 4. 다중상속이 가능하다.
// 5. 추상메소드는 일반클래스의 메소드 형식과 같지만 몸통을 가질 수 없다.
// 6. 선언은 interface [이름] 으로 한다.

interface Animal {
	
	/*public static final*/ int MAX_AGE = 500;
	/*public abstract*/ void sound();
	// 1. 모든 멤버변수는 public static final 이여야 하며, 이를 생략할 수 있음
	// 2. 모든 메소드는 public abstract 이여야 하며, 이를 생략할 수 있음
	// 3. 단) static 메소드와 default 메소드는 예외로 함(JDK 1.8 ~)
	
	/*public*/ default void defaultMethod() {
		System.out.println("디폴트 메소드");
	}
	// 1. (JDK 1.8 ~) 인터페이스에 추가가능
	// 2. 추상메소드가 아니기 때문에 구현하지 않아도됨.
	// 3. 메소드 구현부가 있어야 함
	// 4. 앞에 키워드 default 로 명시해 주어야 함
	// 5. 접근제어자는 public 이며 생략 가능함
	// 6. 유의 : 접근제어자 (default)가 아님
	
	/*public*/ static void staticMethod() {
		System.out.println("static 메소드");
	}
	// static 메소드
	// 1. (JDK 1.8 ~) 인터페이스에 추가가능
	// 2. 접근제어자가 항상 public 이며 생략할 수 있음
	
}

class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹~~");
	}
	
}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍~~");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		// 인터페이스는 객체생성을 할 수 없다.
		
		Cat myCat = new Cat();
		myCat.sound();
		
		Dog myDog = new Dog();
		myDog.sound();
		System.out.println();
		
		Animal myAnimal = new Cat(); //다형성
		myAnimal.sound();
		myAnimal = new Dog();
		myAnimal.sound();
		System.out.println();
		
		Animal[] myAnimals = new Animal[2]; //객체생성X 객체배열생성O
		
		myAnimals[0] = new Cat();
		myAnimals[1] = new Dog();
		
		myAnimals[0].sound();
		myAnimals[1].sound();
		
	}

}






