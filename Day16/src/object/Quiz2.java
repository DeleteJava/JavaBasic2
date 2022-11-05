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
		// 1. �Ʒ� Ŭ������ �����ϰ� �����Ѵ�
		Account storeAcc = new Account("itbank", "qwe@123");
		
		
		// 2. id, pw�� ����ڿ��� �Է� �ް�
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		
		// 3. �ν��Ͻ��� �����
		Account user = new Account(id, pw);
		
		
		// 4. ����� ������ �Է� ���� ������ ������ xx�� �α��� ������ ���~
		if (storeAcc.equals(user)) {
			System.out.println(user.getId() + "�� �α��� ����~");
		}
		else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�~");
		}
		
		sc.close();
		
	}
}
