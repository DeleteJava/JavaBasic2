package accessModifier;

// access method
// - private ����� �����ϰ� �ϴ� �޼���
// - getter, setter��� �Ѵ�

class People {
	private String name;
	private int age;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String result = "%s (%d��)\n";
		
		System.out.printf(result, name, age);
	}
	
	// access �޼���~
	String getName() {	// get������ : �ʵ� ���� ����
		return name;	// ��, �޾Ƽ� ���⸸ �� �� ����
	}
	
	void setName(String name) {	// set������ : ���޹��� ������ �ʵ带 ����
		this.name = name;		// ��, ���� �ٲٱ⸸ �� �� ����
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	// �� access �޼���� ��! �ۼ��� �ʿ�� ����
	// �ʿ��� ��ɸ� ����� �ȴ�
	//
	// ex) �̸��� �ٲ��� �� �ϰ� ������ �ϰ� �;�!
	// - getter�� ����� ��
}

public class Ex02 {
	public static void main(String[] args) {
		People p1 = new People("ȫ�浿", 26);
		
		p1.showInfo();
		
//		p1.name = "ȫ��ȣ";
//		System.out.println("p1�� �̸� : " + p1.name);
		
		
		p1.setName("ȫ��ȣ");
		System.out.println("p1�� �̸� : " + p1.getName());
		
		
		p1.setAge(24);
		System.out.println("p1�� ���� : " + p1.getAge());
		
		
		
		p1.showInfo();
		
	}
}
