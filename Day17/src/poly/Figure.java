package poly;

class Figure {
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("���� �׸���");
	}
}