package object;

// Object Ŭ����
// - �ڹ��� �ֻ��� Ŭ����
// - �ڹٿ��� ������� ��� Ŭ������ ���� ���� ��� Object�� ��� �޴´�
// - ���� ��� Ŭ�����̵��� ��� Object�� ��ĳ������ �����ϴ�

class Person extends Object {	// �� ����� ���� ������ �ڵ����� extends Object�� �ȴ�
	
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String result = "%s (%d��)";
		result = String.format(result, name, age);
	
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {	// this = p1, obj = p2
		
		Person tar = (Person) obj;
		
		if (name.equals(tar.name) && age == tar.age) {
			return true;
		}
		
		return false;
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿", 34);
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		// ���� ������ ��¿� ����, Object���� ��� ���� toString()�� ȣ��ȴ�
		// - ��, toString()�� �������̵� �ϸ� ���� ������ ���ϴ� ���·� ����� �� �ִ�!
		
		
		Person p2 = new Person("ȫ�浿", 34);
		Person p3 = p1;
		
		System.out.println("\np1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		
		System.out.println("p1 == p2 ��� : " + (p1 == p2));
		System.out.println("p1 == p3 ��� : " + (p1 == p3) + "\n");
		// ���� ������ ���ϸ� �ٶ� ���� ����� ������ ���Ѵ�
		// �� pythontutor�� �� �������!!!
		
		
		System.out.println("p1.equals(p2) ��� : " + p1.equals(p2));
		System.out.println("p1.equals(p3) ��� : " + p1.equals(p3));
		
		
		
	}
}
