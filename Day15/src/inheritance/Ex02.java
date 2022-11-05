package inheritance;

import other.Person;

class Police extends Person {
	private String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		
		this.rank = rank;
	}

	@Override
	public void showInfo() {
		String result = "%s (%d세, %s)\n";
		
		System.out.printf(result, name, age, rank);
	}
	
	
	void patrol(String area) {
		String result = "%s - %s이 %s(을)를 순찰합니다~\n";
		
		System.out.printf(result, name, rank, area);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 연습) 아래 코드가 동작되게 하라
		// 단, other 패키지의 Person을 꼭 상속 받을 것
		
		Police pol = new Police("이길동", 29, "순경");
		
		pol.showInfo();		// 이길동 (29세, 순경)
		pol.eat("빵");		// 이길동이 빵을 먹는다. 냠냠
		
		
		pol.patrol("해운대구");
		// 이길동 - 순경이 해운대를 순찰합니다~
		
		
		
	}
}
