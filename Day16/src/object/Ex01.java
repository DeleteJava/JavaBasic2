package object;

// Object 클래스
// - 자바의 최상위 클래스
// - 자바에서 만들어진 어떠한 클래스든 예외 없이 모두 Object를 상속 받는다
// - 따라서 어떠한 클래스이든지 모두 Object로 업캐스팅이 가능하다

class Person extends Object {	// ※ 상속을 받지 않으면 자동으로 extends Object가 된다
	
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String result = "%s (%d세)";
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
		
		Person p1 = new Person("홍길동", 34);
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		// 참조 변수를 출력에 사용시, Object에서 상속 받은 toString()이 호출된다
		// - 즉, toString()을 오버라이딩 하면 참조 변수를 원하는 형태로 출력할 수 있다!
		
		
		Person p2 = new Person("홍길동", 34);
		Person p3 = p1;
		
		System.out.println("\np1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		
		System.out.println("p1 == p2 결과 : " + (p1 == p2));
		System.out.println("p1 == p3 결과 : " + (p1 == p3) + "\n");
		// 참조 변수를 비교하면 바라 보는 대상이 같은지 비교한다
		// ※ pythontutor에 꼭 띄워봐라!!!
		
		
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
		System.out.println("p1.equals(p3) 결과 : " + p1.equals(p3));
		
		
		
	}
}
