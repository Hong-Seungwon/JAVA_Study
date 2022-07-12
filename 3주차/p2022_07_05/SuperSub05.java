package p2022_07_05;

// 메소드 오버라이딩(Method Overriding) : 부모 클래스로 부터 상속받은 메소드를 자식 클래스에서 재정의해서 사용
// 1. 부모 클래스로 부터 상속받은 메소드를 자식 클래스에서 메소드 오버라이딩을 하면 메소드 오버라이딩된 메소드만 호출되고,
//    부모 클래스의 메소드는 은닉이 되어 자식 클래스에 상속되지 않음
// 2. 부모 클래스에 은닉된 메소드를 호출할 때는 자식 클래스의 메소드 안에서 super.parentPrn() 형식을로 호출

class Parent05 {
	public void parentPrn() {		// 부모 클래스
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

// Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child05 extends Parent05 {	// 자식 클래스
//	super.parentPrn();				// 오류 발생
	
	// 슈퍼 클래스에 있는 ParentPrn 메소드를 오버라이딩하면 Child로 선언된 객체는 슈퍼 클래스의 메소드가 은닉되어 상속 받지 못함
	public void parentPrn() {	// 메소드 오버라이딩(Method Overriding)
		super.parentPrn(); 		// 부모 클래스의 은닉 메소드 호출
		System.out.println("서브 클래스 : ParentPrn 메서드");
	}

	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class SuperSub05 {
	public static void main(String[] args) {
		Child05 c = new Child05(); 		// 서브 클래스로 객체를 생성
		c.parentPrn(); 				// 오버라이딩된 서브 클래스의 메서드 호출
		c.childPrn(); 				// 서브 클래스 자기 자신의 메서드 호출
		System.out.println("-------------------------------------------->> ");
		Parent p = new Parent(); 	// 슈퍼 클래스로 객체를 생성
		p.parentPrn(); 				// 슈퍼 클래스(자기 자신)의 메서드 호출
	}
}
