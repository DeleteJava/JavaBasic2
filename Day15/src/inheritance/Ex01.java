package inheritance;

import other.Person;


class Student extends Person {
	private String grade;
	
	Student(String name, int age, String grade) {
		
		super(name, age);	// �θ��� �����ڸ� ȣ���ϴ� Ű����
	
		this.grade = grade;
	}
	
	
	@Override
	public void showInfo() {
		String result = "%s (%d��, %s)\n";
		
		System.out.printf(result, name, age, grade);
	}
	
	// �޼��� �������̵� : �θ��� �޼��带 ������ �ϴ� ��
	// �� �������̵�� �θ��� ���¸� �״�� ����Ѵ�!!!
	//
	// �����ε� VS �������̵�
	// 1. �����ε� 	: ���� �̸��� �޼��带 ������ �ۼ��ϴ� ���
	// 2. �������̵� 	: �θ� �޼��� ������
	
	
	void study(String sub) {
		String result = "%s(��)�� %s(��)�� �����մϴ�\n";
		
		System.out.printf(result, name, sub);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		
		p1.showInfo();
		p1.eat("����");
		
		System.out.println();
		
		
		
		Student stu = new Student("ȫ��ȣ", 16, "���л�");
		
		stu.showInfo();		// �������̵�� �޼���
		stu.eat("����");		// �������̵� ���� ���� �޼���
		
							// ��, �������̵�� �ʼ��� �ƴϴ�~~
		
		stu.study("Java");
	}
}
