package _final;

// final : ������
// 1. ������ ���	: ������ ������ �ٲ��� �ʴ� ��� �������� �����Ѵ�
// 2. �޼��忡 ���	: �ڽ� Ŭ�������� �������̵��� ���´�
// 3. Ŭ������ ���	: ����� �Ұ����� Ŭ������ �ȴ�

public class Ex01 {
	public static void main(String[] args) {
		int it = 10;
		final int fit = 10;
		
		System.out.println("it = " + it);
		System.out.println("fit = " + fit + "\n");
		
		
		it = 100;
		// fit = 200;
		
		
		System.out.println("fit + 30 = " + (fit + 30));
		System.out.println("fit > 5 ��� : " + (fit > 5));
		
		// fit += 20;
		// fit++;
		// - final ������ ����� ���� �����ϴ� ������ ��� �Ұ���
	}
}
