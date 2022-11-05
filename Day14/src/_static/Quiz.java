package _static;

import other.Func;

public class Quiz {
	public static void main(String[] args) {
		// Math 같이 인스턴스 없이 사용 가능한 클래스를 직접 구현해 보자
		// 단, 클래스는 other 패키지에 생성할 것
		
		
		// 1. 1 ~ n까지 일력로 출력하는 메서드 
		Func.printNumber(5);			// 1 2 3 4 5
		Func.printNumber(7);			// 1 2 3 4 5 6 7
		
		
		
		// 2. 1 ~ n까지의 합계를 반환하는 메서드
		int sum = Func.total(5);		
		
		System.out.println("\nsum = " + sum);			// 15
		System.out.println("결과 : " + Func.total(7));	// 28
		
		System.out.println();
		
		// 3. 전달한 배열을 일렬로 출력하는 메서드
		int[] arr1 = new int[] { 10,20,30,40,50 };
		int[] arr2 = new int[] { 3, 5, 7, 1 };
		
		
		Func.printArr(arr1);			// 10 20 30 40 50
		Func.printArr(arr2);			// 3 5 7 1
		
		
		// 4. Math 클래스 처럼 인스턴스 생성이 불가능하게도 해보세요~
		// Func func = new Func();
		
	}
}
