package inheritance;

import other.Person;

public class Ex05 {
	public static void main(String[] args) {
		
		Person per = new Person("�̿���", 30);
		Student stu = new Student("ȫ�浿", 19, "����л�");
		Police pol = new Police("����ȣ", 33, "����");
		Doctor doc = new Doctor("��ö��", 35, "����");
		
		
		// ����� ���� �𿩶�~~~
		Person[] pers = new Person[] { per, stu, pol, doc };
		//								0    1    2    3
		
		pers[0].showInfo();
		pers[1].showInfo();
		pers[2].showInfo();
		
		System.out.println();
		
		
		Doctor tmp = (Doctor)pers[3];
		tmp.cure(stu);
		
		// �ٿ� ĳ���ý� ���� Ÿ�԰� �ٸ��� ���� �߻��Ѵ�!!!
		// ex) ���� �����̾��� ��ü�� �ǻ�� ��ȭ�� ���� �߻�
		//
		// �̸� �Ǻ��ϴ� Ű���尡 instacnceof ��� Ű���尡 �ִ�
		
		System.out.println(pers[3] instanceof Doctor);
		// - pers[3]�� �ǻ簡 �½��ϱ�? true
		
		System.out.println(pers[2] instanceof Doctor);
		// - pers[2]�� �ǻ簡 �½��ϱ�? false
		
		System.out.println(pers[2] instanceof Police);
		// - pers[2]�� ������ �½��ϱ�? true
		
	}
}
