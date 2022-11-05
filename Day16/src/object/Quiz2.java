package object;

import java.util.Scanner;

class Account {
	private String id, pw;
	
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}

	
	String getId() {
		return id;
	}
	
}

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 아래 클래스가 동작하게 구현한다
		Account storeAcc = new Account("itbank", "qwe@123");
		
		
		// 2. id, pw를 사용자에게 입력 받고
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		
		// 3. 인스턴스로 만든다
		Account user = new Account(id, pw);
		
		
		// 4. 저장된 계정과 입력 받은 계정이 같으면 xx님 로그인 성공을 출력~
		if (storeAcc.equals(user)) {
			System.out.println(user.getId() + "님 로그인 성공~");
		}
		else {
			System.out.println("일치하는 계정이 없습니다~");
		}
		
		sc.close();
		
	}
}
