package _static;

class Human {
	private String name;
	private int age;
	
	private static int eyes = 2;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		String result = "%s (%d��, �� %d)\n";
		
		System.out.printf(result, name, age, eyes);
	}
	
	static int getEyes() {
		return eyes;
	}
	
	static void setEyes(int eyes) {
		Human.eyes = eyes;		// static ����� '�ν��Ͻ�'�� ��� ����ȴ�
								// ����, �ν��Ͻ��� ���� �ʱ� ������ this�� ����
	}
}

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("���� ����� �� ���� : " + Human.getEyes() + "\n");
		
		Human h1 = new Human("ȫ�浿", 21);
		Human h2 = new Human("��浿", 14);
		Human h3 = new Human("�̱浿", 41);
		
		Human.setEyes(3);
		
		h1.show();
		h2.show();
		h3.show();
		
	}
}
