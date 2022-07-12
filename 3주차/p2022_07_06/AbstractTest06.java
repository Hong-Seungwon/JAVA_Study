package p2022_07_06;

interface IHello06 {	// 인터페이스
	int a = 10;			// 상수 : public static final 생략

	public abstract void sayHello(String name);		// 추상 메소드
}

interface IGoodBye06 {	// 인터페이스
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

// 인터페이스끼리 상속을 받을 때는 extends로 상속을 받아야 되고, 다중 상속도 가능
interface ITotal06 extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);		// 추상 메소드
}

class SubClass06 implements ITotal06 {
	public void sayHello(String name) {				// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {			// 메소드 오버라이딩
		System.out.println(name + "씨 안녕히 가세요!");
	}

	public void greeting(String name) {				// 메소드 오버라이딩
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");		// 메소드 오버라이딩된 메소드 호출
		test.sayGoodBye("이순신");	// 메소드 오버라이딩된 메소드 호출
		test.greeting("홍승원");		// 메소드 오버라이딩된 메소드 호출
		
		System.out.println(IHello06.a);	// 10
//		IHello06.a = 30; // a는 상수이기 때문에 값 수정 불가
	}
}