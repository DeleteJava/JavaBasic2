package _abstract;

import ohter.*;


class Square extends Figure {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
	
		// 추상 클래스는 인스턴스를 못 만들지만
		// 참조 변수는 사용할 수 있다! -> 왜? 업캐스팅 해야하니까~~
		Figure[] figs = new Figure[] { tri, squ, cir };
		
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
	}
}
