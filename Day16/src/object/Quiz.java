package object;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ� ID, PW�� ����Ǿ� �ִ�
		// ����ڿ��� ID, PW�� �Է� �޾Ƽ� 
		// �Ʒ� ������ �Ϻ��� ��ġ�ϸ� 'xx�� �α����� ȯ���մϴ�'
		// �ϳ��� Ʋ���� '��ġ�ϴ� ������ �����ϴ�'�� ���
		
		String storeId = "itbank";
		String storePw = "qwe@123";
		
		
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		if (storeId.equals(id) && storePw.equals(pw)) {
			System.out.println(id + "�� �α����� ȯ���մϴ�~");
		}
		else {
			System.out.println("��ġ�ϴ� ������ �������� �ʽ��ϴ�");
		}
		
		sc.close();
		
		
	}
}
