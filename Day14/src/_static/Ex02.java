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
		String result = "%s (%d세, 눈 %d)\n";
		
		System.out.printf(result, name, age, eyes);
	}
	
	static int getEyes() {
		return eyes;
	}
	
	static void setEyes(int eyes) {
		Human.eyes = eyes;		// static 멤버는 '인스턴스'가 없어도 실행된다
								// 따라서, 인스턴스를 받지 않기 때문에 this가 없다
	}
}

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("현재 사람의 눈 개수 : " + Human.getEyes() + "\n");
		
		Human h1 = new Human("홍길동", 21);
		Human h2 = new Human("김길동", 14);
		Human h3 = new Human("이길동", 41);
		
		Human.setEyes(3);
		
		h1.show();
		h2.show();
		h3.show();
		
	}
}
