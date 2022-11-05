package poly;

class Figure {
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}