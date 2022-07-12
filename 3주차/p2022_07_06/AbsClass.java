package p2022_07_06;

public abstract class AbsClass {	// 추상 클래스
	int a = 10;						// 멤버변수
	
	// 추상 메소드 : 메소드 이름만 있고, 내용이 없는 메소드
	abstract void Method01();
	
	void Method02() {				// 일반 메소드
		System.out.println("일반 메소드");
	}
}
