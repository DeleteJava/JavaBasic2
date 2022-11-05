package accessModifier;

class Ball {
	private String type;
	
	Ball(String type) {
		this.type = type;
	}
	
	String getType() {
		return type;
	}
}

class Child {
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		
		String result = "%s (공 : %s)\n";
		String type = (ball == null) ? "x" : ball.getType();
		
		System.out.printf(result, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;

		String result = "\n%s가 %s을 얻었다!!!\n";
		
		System.out.printf(result, name, ball.getType());
	}
	
	void throwBall(Child tar) {
		tar.ball = ball;
		
		String result = "\n%s가 %s에게 %s을 던짐\n";
		System.out.printf(result, name, tar.name, ball.getType());
		
		ball = null;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 아이들 두 명이 공을 주고 받는 상호 작용을 다시 구현한다
		// 단, 모든 필드는 private로 처리할 것!!!
		
		Child minsu = new Child("민수"); 		// 필드는 이름과 공
		Child jinho = new Child("진호");
		
		Ball base = new Ball("야구공");
		
		
		minsu.showInfo();		// 민수 (공 : x)
		jinho.showInfo();		// 진호 (공 : x)
		
		minsu.takeBall(base);	// 민수가 야구공을 얻었다!!!
		
		minsu.showInfo();		// 민수 (공 : 야구공)
		jinho.showInfo();		// 진호 (공 : x)
		
		
		minsu.throwBall(jinho);
		
		minsu.showInfo();		// 민수 (공 : x)
		jinho.showInfo();		// 진호 (공 : 야구공)
	}
}
