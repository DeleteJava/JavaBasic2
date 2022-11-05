package inheritance;

import other.Person;

class Doctor extends Person {
	private String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		
		this.major = major;
	}
	
	@Override
	public void showInfo() {
		String result = "%s (%d��, %s)\n";
		
		System.out.printf(result, name, age, major);
	}
	
	
	// '���'�� �޾Ƽ� ġ���ϴ� �޼��� 
	// - ��, Person�� ��� ���� Ŭ������ ��� �޾�����
	void cure(Person tar) {
		String result = "%s�� %s(��)�� %s(��)�� ġ���մϴ�\n";
		
		System.out.printf(result, major, name, tar.getName());
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", 19, "����л�");
		Police pol = new Police("����ȣ", 33, "����");
		Doctor doc = new Doctor("��ö��", 35, "����");
		
		doc.showInfo();
		
		doc.cure(stu);
		doc.cure(pol);
	}
}
