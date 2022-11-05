package _abstract;

import ohter.Animal;

class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "(��)�� �߿� �߿�");
	}
	
}

class Dog extends Animal {
	
	Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println(name + "(��)�� �۸�");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Cat cat = new Cat("����");
		
		System.out.println("cat = " + cat);
		cat.bark();
		
		
		Dog dog = new Dog("��Ű");
		
		System.out.println("\ndog = " + dog);
		dog.bark();
		
		
	}
}
