package p2022_07_06;

abstract class AbstractClass {				// 추상 클래스
	int a = 10;
	abstract void Method01();				// 추상 메소드
	void Method02() {						// 일반 메소드
		System.out.println("Method02: 추상 클래스에서 구현");
	}
}

// 추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메소드를 자식 구현 클래스에서 반드시 오버라이딩을 해야 함
class SubClass extends AbstractClass {		// 자식 클래스
	@Override
	void Method01() {
		System.out.println("Method01: 서브 클래스에서 구현된 추상 메소드");
	}	

//	void Method01() {
//		System.out.println("Method01: 서브 클래스에서 구현된 추상 메소드");
//	}
}

class AbstractTest01 {
	public static void main(String args[]) {
// 추상 클래스는 자체적으로 객체 생성을 할 수 없음
//		AbstractClass abs = new AbstractClass(); // 오류 발생
		
		SubClass obj = new SubClass();
		obj.Method01();		// 메소드 오버라이딩된 메소드 호출
		obj.Method02();		// 부모 클래스에서 상속받은 Method02()메소드 호출
	}
}