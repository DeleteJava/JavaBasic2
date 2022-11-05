package ohter;

// interface : 인터페이스
// - 추상 클래스보다 한 단계 더 추상화된 클래스
// - 클래스와 구분하기 위해 인터페이스라는 명칭을 붙임
// - 추상 클래스 처럼 인스턴스 생성이 불가능하다
// - 필드는 모두 public static final 속성이 자동으로 부여된다
// - 메서드는 모두 public abtract 속성을 가진다
// - 즉, 인스턴스 멤버가 하나도 없다
//
// 중요!!!) 인터페이스는 다중 상속이 가능하다

public interface FlyAble {
	String type = "날개";
	
	void fly();
}