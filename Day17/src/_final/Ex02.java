package _final;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// 1. final �޼��� : �ڽĿ��� �������̵��� ���´� -> 2������~ 
	final void eat(String food) {
		String result = "%s(��)�� %s(��)�� �Դ´�\n";
		
		System.out.printf(result, name, food);
	}
}

// 3�� - final Ŭ������ ����� ���� Ŭ���� -> 4������~
final class Student extends Person {
	String grade;
	
	Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + grade + ")";
	}
	
//	- 2��
//	@Override
//	void eat(String food) {
//		System.out.println("���� ���� �ʽ��ϴ�");
//	}
}

// - 4�� -> 5������~
//class PostgraduateStudent extends Student {
//	
//}


public class Ex02 {
	public static void main(String[] args) {
		Person hong = new Person("ȫ�浿");
		
		System.out.println("hong = " + hong);
		hong.eat("����");
		
		
		// 5��. final Ŭ������ ������� �� �ϴ� Ŭ������ �ƴϴ�!!!
		// - ����� �Ұ����� ��
		Student stu = new Student("��浿", "����л�");
		
		System.out.println("\nstu = " + stu);
		stu.eat("���");
		
		
		
		
	}
}
