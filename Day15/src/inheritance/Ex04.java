package inheritance;

import other.Person;

class Doctor extends Person {
	private String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		
		this.major = major;
	}
	
	@Override
	public void showInfo() {
		String result = "%s (%d세, %s)\n";
		
		System.out.printf(result, name, age, major);
	}
	
	
	// '사람'을 받아서 치료하는 메서드 
	// - 즉, Person을 상속 받은 클래스는 모두 받아진다
	void cure(Person tar) {
		String result = "%s의 %s(이)가 %s(을)를 치료합니다\n";
		
		System.out.printf(result, major, name, tar.getName());
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 19, "고등학생");
		Police pol = new Police("이진호", 33, "경위");
		Doctor doc = new Doctor("김철수", 35, "내과");
		
		doc.showInfo();
		
		doc.cure(stu);
		doc.cure(pol);
	}
}
