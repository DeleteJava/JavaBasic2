package poly;

// 다형성 : 다양한 형태를 가진다는 의미
// - OOP에서 다형성은 하나의 명령(= 기능)으로 다른 여러 명령을 동시에 수행하기 위해서 사용
//	
//				↗	삼각형	→ 삼각형을 그린다
// 그려라 -> 도형 	→	사각형	→ 사각형을 그린다
//				↘	원		→ 원을 그린다
//
// 다형성을 구현하기 위한 조건
// 1. 상속 관계	: 아래 객체(= 자식)을 묶어서 처리해야 하기 때문
// 2. 오버라이딩 	: 각자 다르게 기능을 구현해야 다양하게 동작하기 때문
//
// ※ 오버라이딩된 메서드는 업캐스팅을 하더라도 자식의 메서드가 실행된다!!!
// - 이를 '동적 바인딩'이라고 하는데 궁금하면 한번 찾아만 보고 넘어가세요~


public class Ex01 {
	public static void main(String[] args) {
		Figure fig = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
				
		// 도형들 모여라
		Figure[] figs = new Figure[] { fig, tri, squ, cir };
		
		// 자~ 도형들 그림 그려라
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
	}
}
