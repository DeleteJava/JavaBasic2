package _static;

// static ����� '�ν��Ͻ�'�� ���� �������� ����ϱ⵵ ������,
// '�ν��Ͻ�'�� ���� ��� ������ Ư¡�� �� ���� Ȱ��ȴ�

public class Ex03 {
	public static void main(String[] args) {
		// ���� ��ǥ���� ���� Math��� Ŭ������ �ִ�
		
		System.out.println("������ : " + Math.PI);
		System.out.println("�ڿ���� : " + Math.E + "\n");
		
		
		// Math m = new Math();
		// - Math�� �����ڰ� private ó�� �Ǿ��ְ�
		// - ���� ���ο��� '�Ϲ� ���'�� �ϳ��� ����
		// - ��, �ν��Ͻ� ���� ���� ���ؼ� ������� Ŭ������
		
		System.out.println("-5�� ���밪 : " + Math.abs(-5));
		
		System.out.println("1.12345 = " + Math.round(1.12345));
		
		System.out.println("2^10 = " + Math.pow(2, 10));
		
		System.out.println("16�� ������ : " + Math.sqrt(16));
		
		System.out.println("2�� ������ : " + Math.sqrt(2));
		
	}
}
