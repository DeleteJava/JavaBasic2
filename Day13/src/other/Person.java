package other;

// public Ŭ����
// - �ܺο��� ��� ������ Ŭ����
// - ã�� ��, ���ϸ����� ã�� ������ Ŭ������� ���ϸ��� ��ġ�ؾ� ��
// - ���� ���������� ������ �ۼ� �Ұ���

public class Person {
	public String name;
	int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	public void show() {
		String result = "%s (%d��, %.1fcm)\n";
		
		System.out.printf(result, name, age, height);
	}
}
