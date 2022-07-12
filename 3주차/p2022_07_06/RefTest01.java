package p2022_07_06;

class Parent {
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child extends Parent {
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

// 업 캐스팅(자동 형변환)
// 1. 서브 클래스에서 슈퍼 클래스로 형변환 하는 것
// 2. 참조 가능한 영역이 축소가 됨
// 3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 됨
class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();				// 상속받은 메소드 호출
		c.childPrn();
		
		Parent p;		
		p = (Parent) c;				// 업 캐스팅(=자동 형변환)

		Parent p1 = new Child();	// 업 캐스팅(자동 형변환)
		
		// 업 캐스팅이 되면 부모가 상속해준 메소드만 접근 가능
		// 업 캐스팅이 되면 참조 가능한 영역의 축소가 일어남
		p.parentPrn();				// 업 캐스팅 후에는 부모로부터 상속받은 메소드만 호출 가능
// 		p.childPrn();				// 부모가 상속 해주지 않은 메소드는 접근 불가능
	}
}