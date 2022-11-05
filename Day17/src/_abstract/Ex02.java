package _abstract;

import ohter.*;


class Square extends Figure {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Circle extends Figure {
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
	
		// �߻� Ŭ������ �ν��Ͻ��� �� ��������
		// ���� ������ ����� �� �ִ�! -> ��? ��ĳ���� �ؾ��ϴϱ�~~
		Figure[] figs = new Figure[] { tri, squ, cir };
		
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
	}
}
