package _static;

import other.Func;

public class Quiz {
	public static void main(String[] args) {
		// Math ���� �ν��Ͻ� ���� ��� ������ Ŭ������ ���� ������ ����
		// ��, Ŭ������ other ��Ű���� ������ ��
		
		
		// 1. 1 ~ n���� �Ϸ·� ����ϴ� �޼��� 
		Func.printNumber(5);			// 1 2 3 4 5
		Func.printNumber(7);			// 1 2 3 4 5 6 7
		
		
		
		// 2. 1 ~ n������ �հ踦 ��ȯ�ϴ� �޼���
		int sum = Func.total(5);		
		
		System.out.println("\nsum = " + sum);			// 15
		System.out.println("��� : " + Func.total(7));	// 28
		
		System.out.println();
		
		// 3. ������ �迭�� �Ϸķ� ����ϴ� �޼���
		int[] arr1 = new int[] { 10,20,30,40,50 };
		int[] arr2 = new int[] { 3, 5, 7, 1 };
		
		
		Func.printArr(arr1);			// 10 20 30 40 50
		Func.printArr(arr2);			// 3 5 7 1
		
		
		// 4. Math Ŭ���� ó�� �ν��Ͻ� ������ �Ұ����ϰԵ� �غ�����~
		// Func func = new Func();
		
	}
}
