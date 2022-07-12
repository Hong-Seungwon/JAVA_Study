package p2022_07_06;

class Parent03 {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

//다운 캐스팅(강제 형변환)
//1. 슈퍼 클래스에서 서브 클래스로 형변환 하는 것
//2. 참조 가능한 영역이 확대 됨
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기 때문에 자료형 생략 불가(강제 형변환)
class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03();		// 업 캐스팅
		p.parentPrn();					// 상속해준 메소드만 접근 가능
		// p.childPrn(); 				// 상속해주지 않은 메소드는 접글 불가능
		
		System.out.println("---------------->>");
		Child c; 						// 서브 클래스로 레퍼런스 변수 선언
		// 서브 클래스 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값 대입
		c = (Child03) p;	// 강제 형변환으로 다운 캐스팅
		c.parentPrn();		// 상속받은 parentPrn() 메소드 접근 가능
		c.childPrn();		// 자식 클래스의 childPrn() 메소드 접근 가능
	}
}