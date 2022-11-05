package _static;


class Person {
	// 일반 멤버 : 인스턴스(= 객체)마다 고유하게 가지는 공간
	// - 따라서 '인스턴스 멤버'라고도 한다
	String name;
	int age;
	
	
	// 정적 멤버 : 인스턴스가 공유하는 공간
	// - 클래스(= Person) 자체가 가지는 공간
	// - 따라서 인스턴스 없이도 바로 사용가능한 특징을 가지며
	// - '클래스 멤버'라고도 한다
	static int eyes = 2;
	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String result = "%s (%d세, 눈 %d)\n";
		
		System.out.printf(result, name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("현재 사람의 눈 개수 : " + Person.eyes + "\n");
		
		
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("김길동", 32);
		Person p3 = new Person("박길동", 16);
		
		// p1.eyes = 3;
		Person.eyes = 3;
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
		
		
		
	}
}
