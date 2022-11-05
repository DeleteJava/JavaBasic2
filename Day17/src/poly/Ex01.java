package poly;

// ������ : �پ��� ���¸� �����ٴ� �ǹ�
// - OOP���� �������� �ϳ��� ����(= ���)���� �ٸ� ���� ������ ���ÿ� �����ϱ� ���ؼ� ���
//	
//				��	�ﰢ��	�� �ﰢ���� �׸���
// �׷��� -> ���� 	��	�簢��	�� �簢���� �׸���
//				��	��		�� ���� �׸���
//
// �������� �����ϱ� ���� ����
// 1. ��� ����	: �Ʒ� ��ü(= �ڽ�)�� ��� ó���ؾ� �ϱ� ����
// 2. �������̵� 	: ���� �ٸ��� ����� �����ؾ� �پ��ϰ� �����ϱ� ����
//
// �� �������̵��� �޼���� ��ĳ������ �ϴ��� �ڽ��� �޼��尡 ����ȴ�!!!
// - �̸� '���� ���ε�'�̶�� �ϴµ� �ñ��ϸ� �ѹ� ã�Ƹ� ���� �Ѿ����~


public class Ex01 {
	public static void main(String[] args) {
		Figure fig = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
				
		// ������ �𿩶�
		Figure[] figs = new Figure[] { fig, tri, squ, cir };
		
		// ��~ ������ �׸� �׷���
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
	}
}