package accessModifier;

class Ball {
	private String type;
	
	Ball(String type) {
		this.type = type;
	}
	
	String getType() {
		return type;
	}
}

class Child {
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		
		String result = "%s (�� : %s)\n";
		String type = (ball == null) ? "x" : ball.getType();
		
		System.out.printf(result, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;

		String result = "\n%s�� %s�� �����!!!\n";
		
		System.out.printf(result, name, ball.getType());
	}
	
	void throwBall(Child tar) {
		tar.ball = ball;
		
		String result = "\n%s�� %s���� %s�� ����\n";
		System.out.printf(result, name, tar.name, ball.getType());
		
		ball = null;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// ���̵� �� ���� ���� �ְ� �޴� ��ȣ �ۿ��� �ٽ� �����Ѵ�
		// ��, ��� �ʵ�� private�� ó���� ��!!!
		
		Child minsu = new Child("�μ�"); 		// �ʵ�� �̸��� ��
		Child jinho = new Child("��ȣ");
		
		Ball base = new Ball("�߱���");
		
		
		minsu.showInfo();		// �μ� (�� : x)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		minsu.takeBall(base);	// �μ��� �߱����� �����!!!
		
		minsu.showInfo();		// �μ� (�� : �߱���)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		
		minsu.throwBall(jinho);
		
		minsu.showInfo();		// �μ� (�� : x)
		jinho.showInfo();		// ��ȣ (�� : �߱���)
	}
}
