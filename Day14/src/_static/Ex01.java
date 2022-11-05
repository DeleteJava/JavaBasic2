package _static;


class Person {
	// �Ϲ� ��� : �ν��Ͻ�(= ��ü)���� �����ϰ� ������ ����
	// - ���� '�ν��Ͻ� ���'��� �Ѵ�
	String name;
	int age;
	
	
	// ���� ��� : �ν��Ͻ��� �����ϴ� ����
	// - Ŭ����(= Person) ��ü�� ������ ����
	// - ���� �ν��Ͻ� ���̵� �ٷ� ��밡���� Ư¡�� ������
	// - 'Ŭ���� ���'��� �Ѵ�
	static int eyes = 2;
	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String result = "%s (%d��, �� %d)\n";
		
		System.out.printf(result, name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("���� ����� �� ���� : " + Person.eyes + "\n");
		
		
		Person p1 = new Person("ȫ�浿", 25);
		Person p2 = new Person("��浿", 32);
		Person p3 = new Person("�ڱ浿", 16);
		
		// p1.eyes = 3;
		Person.eyes = 3;
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
		
		
		
	}
}
