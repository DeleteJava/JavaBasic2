package accessModifier;

import other.Person;
// - �ܺ� ��Ű���� import�� �ؾ� ��� ����~

// ���� ���� ������ : Ŭ������ ����� �����ϴ� ������ �����ϴ� Ű����
// 1. private	: Ŭ���� ���ο����� ���� ����
// 2. package	: ���� + ���� ��Ű������ ���� ����
// 3. protected	: ���� + ��Ű�� + ��� ���� �ڽ� Ŭ�������� ���� ����
// 4. public	: ���� + ��Ű�� + ��� + �ܺ�. ��, ��𼭵� ���� ����
//
// �� package�� �ƹ��͵� �������� ���� ���¸� �ǹ�

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22, 172.2);
		
		p1.name = "ȫ��ȣ";
//		p1.age = 20;
//		p1.height = 170.3;
//		- private�� �ش� Ŭ���� ���θ� ��� ��ġ���� ���� �Ұ���
		
		p1.show();
	}
}
