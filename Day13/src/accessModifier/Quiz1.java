package accessModifier;

import other.Car;

public class Quiz1 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 �����ϰ� Ŭ������ �ۼ��Ѵ�
		// ��, Ŭ������ other ��Ű�� �ȿ� �ۼ��� ��!!!
		
		Car morning = new Car("���");
		// �ʵ�� �𵨸�, �ӵ��� ������
		// ��, ��� private�� ó���� ��
		
		
		morning.show();		// ��� (0 km/h)
		
		
		morning.accel(50);	// 50 km/h ����!!!
							// ��� (50 km/h)
		
		morning._break(30);	// 30 km/h ����!!!
							// ��� (20 km/h)
		
		
	}
}
