package inheritance;

import other.Person;

class Airplain {
	
	private Person[] sits = new Person[10];		// �¼�
	
	
	void riddeOn(Person tar) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {	// �ش� ��°(i) �¼��� �������(null)
				
				sits[i] = tar;		// �ش� �¼��� ����
				
				System.out.printf("%s�� ž��~\n", tar.getName());
				return;
			}
			
		}
		
		System.out.println("�� �¼��� �� �̻� �����ϴ�...");
	}
	
	void showList() {
		System.out.println("\n���� �°� ���)");
		
		for (int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "��° �¼� : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("-- ���¼� --");
			}
		}
		
	}

	void emergency(Person tar) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] instanceof Doctor) {
				System.out.println(i + 1 + "�� �¼����� �ǻ� �߰�!!!");
				
				Doctor tmp = (Doctor)sits[i];
				
				tmp.cure(tar);
				return;
			}
		}
		
		System.out.println("�⳻�� �ǻ簡 �����ϴ�...");
	}
}

public class Quiz {
	public static void main(String[] args) {
		Person per = new Person("�̿���", 30);
		Student stu = new Student("ȫ�浿", 19, "����л�");
		Police pol = new Police("����ȣ", 33, "����");
		Doctor doc = new Doctor("��ö��", 35, "����");
		
		
		Airplain air = new Airplain();
		
		air.riddeOn(per);		// '���'�� ����⿡ ž���ϴ� �޼���
		air.riddeOn(stu);		// - �� �¼��� ã�Ƽ� ���ʴ�� ����� �¿��
		air.riddeOn(pol);
		air.riddeOn(doc);		// ��, �¼��� ������ Ż �� ���ٶ�� ���
		
		
		air.showList();			// �°� ����� ���
		
		System.out.println();
		
		
		air.emergency(stu);		// ��� ��Ȳ �޼���
								// �⳻���� �ǻ縦 ã�Ƽ�
								// ���޵� '���'�� ġ���ϼ���
								//
								// ����, �ǻ簡 ���ٸ� ���ٶ�� ���
		
	}
}
