package object;

public class Ex02 {
	public static void main(String[] args) {
		// String은 클래스이다
		// java.lang 패키지에 있음
		// 그리고 이미 equals()가 오버라이딩 되어있다~~
		
		String str1 = "java";				// 상수를 가리킨다
		String str2 = "java";
		String str3 = new String("java");	// 인스턴스를 가리킨다
		
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3 + "\n");
		
		
		System.out.println("str1 == str2 결과 : " + (str1 == str2));
		System.out.println("str1 == str3 결과 : " + (str1 == str3) + "\n");
		
		
		System.out.println("str1.equals(str2) 결과 : " + str1.equals(str2));
	}
}
