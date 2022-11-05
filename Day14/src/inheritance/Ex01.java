package inheritance;

// ��� : ������ �ۼ��� Ŭ������ ������ ���� �޾Ƽ� ���ο� Ŭ������ �ۼ��ϴ� ���
// - ���뼺�� ���������� ȿ�����̴�
//
// ����� ���ִ� Ŭ����	: �θ�, ����, ����, ��� Ŭ������� �Ѵ�
// ����� �޴� Ŭ����		: �ڽ�, ����, ����, �Ļ� Ŭ������� �Ѵ�


class Super {
	int supNum = 10;
	
	void showSuper() {
		System.out.println("�θ��� �޼��� �Դϴ�~~~");
	}
}

// �� ����� ������ Ŭ������ ���� �޾Ƽ� '����� Ȯ��' ��Ű�µ� ������ �д�
// ���� extends��� Ű����� ����� �޴´�
class Sub extends Super {
	int subNum = 30;
	
	void showSub() {
		System.out.println("�ڽ��� �޼��� �Դϴ�!!!");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("sup �ʵ� : " + sup.supNum);
		sup.showSuper();
		
		// - �θ�� �ڽĿ��� ������ ����� �𸥴�
		// System.out.println("sup �ʵ� : " + sup.subNum);
		// sup.showSub();
		
		
		Sub sub = new Sub();
		
		System.out.println("\nsub �ʵ� : " + sub.supNum);
		System.out.println("sub �ʵ� : " + sub.subNum);
		
		sub.showSuper();
		sub.showSub();
		
	}
}
