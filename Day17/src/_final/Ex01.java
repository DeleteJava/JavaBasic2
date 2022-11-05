package _final;

// final : 마지막
// 1. 변수에 사용	: 변수의 공간을 바뀌지 않는 상수 공간으로 지정한다
// 2. 메서드에 사용	: 자식 클래스에서 오버라이딩을 막는다
// 3. 클래스에 사용	: 상속이 불가능한 클래스가 된다

public class Ex01 {
	public static void main(String[] args) {
		int it = 10;
		final int fit = 10;
		
		System.out.println("it = " + it);
		System.out.println("fit = " + fit + "\n");
		
		
		it = 100;
		// fit = 200;
		
		
		System.out.println("fit + 30 = " + (fit + 30));
		System.out.println("fit > 5 결과 : " + (fit > 5));
		
		// fit += 20;
		// fit++;
		// - final 변수는 저장된 값을 변경하는 연산은 모두 불가능
	}
}
