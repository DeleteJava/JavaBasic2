package accessModifier;

// access method
// - private 멤버에 접근하게 하는 메서드
// - getter, setter라고도 한다

class People {
	private String name;
	private int age;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String result = "%s (%d세)\n";
		
		System.out.printf(result, name, age);
	}
	
	// access 메서드~
	String getName() {	// get변수명 : 필드 값을 리턴
		return name;	// 즉, 받아서 보기만 할 수 있음
	}
	
	void setName(String name) {	// set변수명 : 전달받은 값으로 필드를 변경
		this.name = name;		// 즉, 값을 바꾸기만 할 수 있음
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	// ※ access 메서드는 꼭! 작성할 필요는 없고
	// 필요한 기능만 만들면 된다
	//
	// ex) 이름을 바꾸진 못 하고 참조만 하고 싶어!
	// - getter만 만들면 됨
}

public class Ex02 {
	public static void main(String[] args) {
		People p1 = new People("홍길동", 26);
		
		p1.showInfo();
		
//		p1.name = "홍진호";
//		System.out.println("p1의 이름 : " + p1.name);
		
		
		p1.setName("홍진호");
		System.out.println("p1의 이름 : " + p1.getName());
		
		
		p1.setAge(24);
		System.out.println("p1의 나이 : " + p1.getAge());
		
		
		
		p1.showInfo();
		
	}
}
