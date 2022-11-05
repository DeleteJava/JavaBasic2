package inheritance;

import other.Person;

// 클래스 간에도 형변환이 가능하다
// - 단, 상속 관계일때만 가능

public class Ex03 {
	public static void main(String[] args) {
		// 아래는 일반적인 인스턴스 참조
		Student stu = new Student("홍길동", 17, "고등학생");
		
		// 자식의 인스턴스를 부모로 참조 (= 업 캐스팅)
		// - 사람말로 하자면 학생을 '사람' 취급하고 있다
		Person per = new Student("김진호", 16, "중학생");
		
		
		stu.showInfo();
		per.showInfo();
		
		System.out.println();
		
		
		stu.study("Java");
		// per.study("C언어");
		
		System.out.println();
		
		// 결론)
		// 1. 업캐스팅이 되면 자식의 메서드는 사용이 불가능 하다
		// 2. 그럼 왜 쓰나? -> 업캐스팅은 자식을 모두 묶어서 처리 가능하다
		// ex) 학생, 경찰, 의사를 -> '사람'으로 취급해서 처리 가능
		
		
		// 업 캐스팅된 객체를 다시 원래 타입으로 돌리는 과정을 '다운 캐스팅'이라고 한다
		
		Student tmp = (Student)per;		// 방식1. 참조 변수에 강제 형변환으로 대입한다
		tmp.study("C언어");
		
		((Student)per).study("C언어");	// 방식2. 제자리에서 형변환 후 바로 메서드 호출
		
	}
}
