package other;

// private 		: ����
// package 		: ���� + ��Ű��
// protected	: ���� + ��Ű�� + ���
// public		: ���� + ��Ű�� + ��� + �ܺ�

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		String result = "%s (%d��)\n";
		
		System.out.printf(result, name, age);
	}
	
	public void eat(String food) {
		String result = "%s(��)�� %s(��)�� �Դ´�. �ȳ�\n";
		
		System.out.printf(result, name, food);
	}
	
	public String getName() {
		return name;
	}
}
