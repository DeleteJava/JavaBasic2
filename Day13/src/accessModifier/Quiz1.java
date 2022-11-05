package accessModifier;

import other.Car;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성한다
		// 단, 클래스는 other 패키지 안에 작성할 것!!!
		
		Car morning = new Car("모닝");
		// 필드는 모델명, 속도만 가진다
		// 단, 모두 private로 처리할 것
		
		
		morning.show();		// 모닝 (0 km/h)
		
		
		morning.accel(50);	// 50 km/h 가속!!!
							// 모닝 (50 km/h)
		
		morning._break(30);	// 30 km/h 감속!!!
							// 모닝 (20 km/h)
		
		
	}
}
