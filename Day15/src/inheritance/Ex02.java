package inheritance;

import other.Person;

class Police extends Person {
	private String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		
		this.rank = rank;
	}

	@Override
	public void showInfo() {
		String result = "%s (%d��, %s)\n";
		
		System.out.printf(result, name, age, rank);
	}
	
	
	void patrol(String area) {
		String result = "%s - %s�� %s(��)�� �����մϴ�~\n";
		
		System.out.printf(result, name, rank, area);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// ����) �Ʒ� �ڵ尡 ���۵ǰ� �϶�
		// ��, other ��Ű���� Person�� �� ��� ���� ��
		
		Police pol = new Police("�̱浿", 29, "����");
		
		pol.showInfo();		// �̱浿 (29��, ����)
		pol.eat("��");		// �̱浿�� ���� �Դ´�. �ȳ�
		
		
		pol.patrol("�ؿ�뱸");
		// �̱浿 - ������ �ؿ�븦 �����մϴ�~
		
		
		
	}
}
