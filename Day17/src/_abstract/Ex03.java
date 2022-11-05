package _abstract;

import ohter.Animal;

class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "(捞)啊 具克 具克");
	}
	
}

class Dog extends Animal {
	
	Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println(name + "(捞)啊 港港");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Cat cat = new Cat("蹲捞");
		
		System.out.println("cat = " + cat);
		cat.bark();
		
		
		Dog dog = new Dog("钒虐");
		
		System.out.println("\ndog = " + dog);
		dog.bark();
		
		
	}
}
