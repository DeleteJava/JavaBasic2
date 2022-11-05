package inheritance;

import other.Person;

// Ŭ���� ������ ����ȯ�� �����ϴ�
// - ��, ��� �����϶��� ����

public class Ex03 {
	public static void main(String[] args) {
		// �Ʒ��� �Ϲ����� �ν��Ͻ� ����
		Student stu = new Student("ȫ�浿", 17, "����л�");
		
		// �ڽ��� �ν��Ͻ��� �θ�� ���� (= �� ĳ����)
		// - ������� ���ڸ� �л��� '���' ����ϰ� �ִ�
		Person per = new Student("����ȣ", 16, "���л�");
		
		
		stu.showInfo();
		per.showInfo();
		
		System.out.println();
		
		
		stu.study("Java");
		// per.study("C���");
		
		System.out.println();
		
		// ���)
		// 1. ��ĳ������ �Ǹ� �ڽ��� �޼���� ����� �Ұ��� �ϴ�
		// 2. �׷� �� ����? -> ��ĳ������ �ڽ��� ��� ��� ó�� �����ϴ�
		// ex) �л�, ����, �ǻ縦 -> '���'���� ����ؼ� ó�� ����
		
		
		// �� ĳ���õ� ��ü�� �ٽ� ���� Ÿ������ ������ ������ '�ٿ� ĳ����'�̶�� �Ѵ�
		
		Student tmp = (Student)per;		// ���1. ���� ������ ���� ����ȯ���� �����Ѵ�
		tmp.study("C���");
		
		((Student)per).study("C���");	// ���2. ���ڸ����� ����ȯ �� �ٷ� �޼��� ȣ��
		
	}
}
