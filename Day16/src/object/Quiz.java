package object;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 아래 ID, PW가 저장되어 있다
		// 사용자에게 ID, PW를 입력 받아서 
		// 아래 계정과 완벽히 일치하면 'xx님 로그인을 환영합니다'
		// 하나라도 틀리면 '일치하는 계정이 없습니다'를 출력
		
		String storeId = "itbank";
		String storePw = "qwe@123";
		
		
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		if (storeId.equals(id) && storePw.equals(pw)) {
			System.out.println(id + "님 로그인을 환영합니다~");
		}
		else {
			System.out.println("일치하는 계정이 존재하지 않습니다");
		}
		
		sc.close();
		
		
	}
}
