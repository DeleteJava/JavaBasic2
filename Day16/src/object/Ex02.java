package object;

public class Ex02 {
	public static void main(String[] args) {
		// String�� Ŭ�����̴�
		// java.lang ��Ű���� ����
		// �׸��� �̹� equals()�� �������̵� �Ǿ��ִ�~~
		
		String str1 = "java";				// ����� ����Ų��
		String str2 = "java";
		String str3 = new String("java");	// �ν��Ͻ��� ����Ų��
		
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3 + "\n");
		
		
		System.out.println("str1 == str2 ��� : " + (str1 == str2));
		System.out.println("str1 == str3 ��� : " + (str1 == str3) + "\n");
		
		
		System.out.println("str1.equals(str2) ��� : " + str1.equals(str2));
	}
}
