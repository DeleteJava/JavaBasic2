package other;

public class Func {
	private Func() {}
	
	public static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
	}
	
	public static int total(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
