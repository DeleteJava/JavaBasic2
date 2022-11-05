package inheritance;

import other.Person;

class Airplain {
	
	private Person[] sits = new Person[10];		// 좌석
	
	
	void riddeOn(Person tar) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {	// 해당 번째(i) 좌석이 비었으면(null)
				
				sits[i] = tar;		// 해당 좌석에 저장
				
				System.out.printf("%s님 탑승~\n", tar.getName());
				return;
			}
			
		}
		
		System.out.println("빈 좌석이 더 이상 없습니다...");
	}
	
	void showList() {
		System.out.println("\n현재 승객 목록)");
		
		for (int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "번째 좌석 : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("-- 빈좌석 --");
			}
		}
		
	}

	void emergency(Person tar) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] instanceof Doctor) {
				System.out.println(i + 1 + "번 좌석에서 의사 발견!!!");
				
				Doctor tmp = (Doctor)sits[i];
				
				tmp.cure(tar);
				return;
			}
		}
		
		System.out.println("기내에 의사가 없습니다...");
	}
}

public class Quiz {
	public static void main(String[] args) {
		Person per = new Person("이영희", 30);
		Student stu = new Student("홍길동", 19, "고등학생");
		Police pol = new Police("이진호", 33, "경위");
		Doctor doc = new Doctor("김철수", 35, "내과");
		
		
		Airplain air = new Airplain();
		
		air.riddeOn(per);		// '사람'이 비행기에 탑승하는 메서드
		air.riddeOn(stu);		// - 빈 좌석을 찾아서 차례대로 사람을 태운다
		air.riddeOn(pol);
		air.riddeOn(doc);		// 단, 좌석이 꽉차면 탈 수 없다라고 출력
		
		
		air.showList();			// 승객 목록을 출력
		
		System.out.println();
		
		
		air.emergency(stu);		// 긴급 상황 메서드
								// 기내에서 의사를 찾아서
								// 전달된 '사람'을 치료하세요
								//
								// 만약, 의사가 없다면 없다라고 출력
		
	}
}
