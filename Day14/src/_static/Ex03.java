package _static;

// static 멤버는 '인스턴스'가 공유 공간으로 사용하기도 하지만,
// '인스턴스'가 없이 사용 가능한 특징이 더 자주 활용된다

public class Ex03 {
	public static void main(String[] args) {
		// 가장 대표적인 예로 Math라는 클래스가 있다
		
		System.out.println("원주율 : " + Math.PI);
		System.out.println("자연상수 : " + Math.E + "\n");
		
		
		// Math m = new Math();
		// - Math는 생성자가 private 처리 되어있고
		// - 실제 내부에도 '일반 멤버'가 하나도 없다
		// - 즉, 인스턴스 없이 쓰기 위해서 만들어진 클래스다
		
		System.out.println("-5의 절대값 : " + Math.abs(-5));
		
		System.out.println("1.12345 = " + Math.round(1.12345));
		
		System.out.println("2^10 = " + Math.pow(2, 10));
		
		System.out.println("16의 제곱근 : " + Math.sqrt(16));
		
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		
	}
}
