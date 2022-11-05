package _abstract;

import ohter.Animal;
import ohter.FlyAble;

// 1. 클래스의 상속
// - 클래스는 기존의 기능을 물려 받아서 기능을 더욱 '확장' 시키기 위해서 사용
// - Java에선 클래스는 딱 하나만 상속 가능
//
// 2. 인터페이스의 상속
// - 인터페이스는 모두 추상되어있고 자식에 추상메서드를 오버라이딩해서 '구현'해야 한다
// - 인터페이스는 다중 상속이 허용됨 (= 업캐스팅을 다양하게 할 수 있다)


class Bird extends Animal implements FlyAble {
	Bird(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println(name + "(이)가 짹짹");
	}

	@Override
	public void fly() {
		System.out.println(type + "로 날아간다~");
	}
}

class Airplain implements FlyAble {
	
	@Override
	public void fly() {
		System.out.println("엔진 추진력으로 날아간다~");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Cat cat = new Cat("뚱이");
		Dog dog = new Dog("럭키");
		
		Bird bird = new Bird("길동");
		Airplain air = new Airplain();
		
		
		// '동물' 친구들 모여라~ 
		Animal[] ans = new Animal[] { cat, dog, bird };
		
		// 얘들 재롱~
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		
		
		
		
		// '날수있는' 친구들 모여라~
		FlyAble[] flys = new FlyAble[] { bird, air };
		
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
		
		
	}
}
