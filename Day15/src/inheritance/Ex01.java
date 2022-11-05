package inheritance;

import other.Person;


class Student extends Person {
	private String grade;
	
	Student(String name, int age, String grade) {
		
		super(name, age);	// 부모의 생성자를 호출하는 키워드
	
		this.grade = grade;
	}
	
	
	@Override
	public void showInfo() {
		String result = "%s (%d세, %s)\n";
		
		System.out.printf(result, name, age, grade);
	}
	
	// 메서드 오버라이드 : 부모의 메서드를 재정의 하는 것
	// ※ 오버라이드시 부모의 형태를 그대로 써야한다!!!
	//
	// 오버로딩 VS 오버라이딩
	// 1. 오버로딩 	: 같은 이름의 메서드를 여러개 작성하는 기법
	// 2. 오버라이딩 	: 부모 메서드 재정의
	
	
	void study(String sub) {
		String result = "%s(이)가 %s(을)를 공부합니다\n";
		
		System.out.printf(result, name, sub);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		
		p1.showInfo();
		p1.eat("피자");
		
		System.out.println();
		
		
		
		Student stu = new Student("홍진호", 16, "중학생");
		
		stu.showInfo();		// 오버라이드된 메서드
		stu.eat("피자");		// 오버라이드 하지 않은 메서드
		
							// 즉, 오버라이드는 필수가 아니다~~
		
		stu.study("Java");
	}
}
