package _abstract;

import ohter.Animal;
import ohter.FlyAble;

// 1. Ŭ������ ���
// - Ŭ������ ������ ����� ���� �޾Ƽ� ����� ���� 'Ȯ��' ��Ű�� ���ؼ� ���
// - Java���� Ŭ������ �� �ϳ��� ��� ����
//
// 2. �������̽��� ���
// - �������̽��� ��� �߻�Ǿ��ְ� �ڽĿ� �߻�޼��带 �������̵��ؼ� '����'�ؾ� �Ѵ�
// - �������̽��� ���� ����� ���� (= ��ĳ������ �پ��ϰ� �� �� �ִ�)


class Bird extends Animal implements FlyAble {
	Bird(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println(name + "(��)�� ±±");
	}

	@Override
	public void fly() {
		System.out.println(type + "�� ���ư���~");
	}
}

class Airplain implements FlyAble {
	
	@Override
	public void fly() {
		System.out.println("���� ���������� ���ư���~");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Cat cat = new Cat("����");
		Dog dog = new Dog("��Ű");
		
		Bird bird = new Bird("�浿");
		Airplain air = new Airplain();
		
		
		// '����' ģ���� �𿩶�~ 
		Animal[] ans = new Animal[] { cat, dog, bird };
		
		// ��� ���~
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		
		
		
		
		// '�����ִ�' ģ���� �𿩶�~
		FlyAble[] flys = new FlyAble[] { bird, air };
		
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
		
		
	}
}
