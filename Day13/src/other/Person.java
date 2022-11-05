package other;

// public 클래스
// - 외부에서 사용 가능한 클래스
// - 찾을 때, 파일명으로 찾기 때문에 클래스명과 파일명이 일치해야 함
// - 따라서 한페이지에 여러개 작성 불가능

public class Person {
	public String name;
	int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	public void show() {
		String result = "%s (%d세, %.1fcm)\n";
		
		System.out.printf(result, name, age, height);
	}
}
