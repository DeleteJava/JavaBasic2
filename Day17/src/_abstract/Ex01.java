package _abstract;

import ohter.Figure;
import ohter.Triangle;

// abstract : 추상적인
// 추상 클래스 : 추상적인 개념의 객체를 표현하기 위한 클래스
// ex) 사람, 동물, 도형 등
//
// 추상 클래스의 특징
// 1. 추상적인 객체이기 때문에 형태가 없고, '인스턴스'를 생성할 수 없다!!!
//    (단, 참조 변수는 사용 가능)
// 2. 추상 클래스는 내부에 추상 메서드를 가질 수 있다
//
// 추상 메서드?
// - 기능이 없고 이름만 있는 껍데기 메서드
// - 상속 받은 자식 클래스에서 무조건 오버라이딩해서 구현해야 한다 (= 강제성)


public class Ex01 {
	public static void main(String[] args) {
		Figure fig;
		
		// fig = new Figure();
		// - 추상적인 객체는 형태가 없다 -> 객체화 불가능
		// - 즉, 추상 클래스는 상속만을 위한 클래스
		
		Triangle tri = new Triangle();
	
		tri.draw();
		tri.show();
	}
}
