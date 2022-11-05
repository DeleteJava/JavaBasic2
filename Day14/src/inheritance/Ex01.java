package inheritance;

// 상속 : 기존에 작성된 클래스의 내용을 물려 받아서 새로운 클래스를 작성하는 기법
// - 재사용성과 유지보수에 효과적이다
//
// 상속을 해주는 클래스	: 부모, 상위, 슈퍼, 기반 클래스라고 한다
// 상속을 받는 클래스		: 자식, 하위, 서브, 파생 클래스라고 한다


class Super {
	int supNum = 10;
	
	void showSuper() {
		System.out.println("부모의 메서드 입니다~~~");
	}
}

// ※ 상속은 기존의 클래스를 물려 받아서 '기능을 확장' 시키는데 목적을 둔다
// 따라서 extends라는 키워드로 상속을 받는다
class Sub extends Super {
	int subNum = 30;
	
	void showSub() {
		System.out.println("자식의 메서드 입니다!!!");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("sup 필드 : " + sup.supNum);
		sup.showSuper();
		
		// - 부모는 자식에서 생성된 멤버를 모른다
		// System.out.println("sup 필드 : " + sup.subNum);
		// sup.showSub();
		
		
		Sub sub = new Sub();
		
		System.out.println("\nsub 필드 : " + sub.supNum);
		System.out.println("sub 필드 : " + sub.subNum);
		
		sub.showSuper();
		sub.showSub();
		
	}
}
