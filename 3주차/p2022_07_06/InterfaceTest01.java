package p2022_07_06;

interface IHello01 {				// 인터페이스
	void sayHello(String name);		// 추상 메소드 : public abstract 생략
}

class Hello01 implements IHello01 {

	@Override
	public void sayHello(String name) {	// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(name + "씨 안녕하세요!");
	}
	
//	public void sayHello(String name) {
////	void sayHello(String name){		// public이 반드시 추가 되어야 함
//		System.out.println(name + "씨 안녕하세요!");
//	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		// 인터페이스는 자체적으로 객체 생성을 할 수 없음
//		IHello01 ih = new IHello01();	// 오류 발생
		
		Hello01 obj = new Hello01();
		obj.sayHello(args[0]);		// 메소드 오버라이딩된 sayHello()메소드 호출
		obj.sayHello(args[1]);		// 
	}
}
