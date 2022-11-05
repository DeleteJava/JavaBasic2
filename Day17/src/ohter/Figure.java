package ohter;

public abstract class Figure {
	
	// 1. 일반 메서드
	public void show() {
		System.out.println("도형을 상속 받은 클래스~");
	}
	
	// 2. 추상 메서드
	public abstract void draw();
}
