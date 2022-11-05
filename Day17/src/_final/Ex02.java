package _final;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// 1. final 메서드 : 자식에서 오버라이딩을 막는다 -> 2번으로~ 
	final void eat(String food) {
		String result = "%s(이)가 %s(을)를 먹는다\n";
		
		System.out.printf(result, name, food);
	}
}

// 3번 - final 클래스는 상속을 막는 클래스 -> 4번으로~
final class Student extends Person {
	String grade;
	
	Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + grade + ")";
	}
	
//	- 2번
//	@Override
//	void eat(String food) {
//		System.out.println("밥을 먹지 않습니다");
//	}
}

// - 4번 -> 5번으로~
//class PostgraduateStudent extends Student {
//	
//}


public class Ex02 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		
		System.out.println("hong = " + hong);
		hong.eat("피자");
		
		
		// 5번. final 클래스는 사용하지 못 하는 클래스가 아니다!!!
		// - 상속이 불가능할 뿐
		Student stu = new Student("김길동", "고등학생");
		
		System.out.println("\nstu = " + stu);
		stu.eat("라면");
		
		
		
		
	}
}
