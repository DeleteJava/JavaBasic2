package inheritance;

import other.Person;

public class Ex05 {
	public static void main(String[] args) {
		
		Person per = new Person("이영희", 30);
		Student stu = new Student("홍길동", 19, "고등학생");
		Police pol = new Police("이진호", 33, "경위");
		Doctor doc = new Doctor("김철수", 35, "내과");
		
		
		// 사람들 여기 모여라~~~
		Person[] pers = new Person[] { per, stu, pol, doc };
		//								0    1    2    3
		
		pers[0].showInfo();
		pers[1].showInfo();
		pers[2].showInfo();
		
		System.out.println();
		
		
		Doctor tmp = (Doctor)pers[3];
		tmp.cure(stu);
		
		// 다운 캐스팅시 원래 타입과 다르면 예외 발생한다!!!
		// ex) 원래 경찰이었던 객체를 의사로 변화시 예외 발생
		//
		// 이를 판별하는 키워드가 instacnceof 라는 키워드가 있다
		
		System.out.println(pers[3] instanceof Doctor);
		// - pers[3]은 의사가 맞습니까? true
		
		System.out.println(pers[2] instanceof Doctor);
		// - pers[2]은 의사가 맞습니까? false
		
		System.out.println(pers[2] instanceof Police);
		// - pers[2]은 경찰이 맞습니까? true
		
	}
}
