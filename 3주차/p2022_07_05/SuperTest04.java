package p2022_07_05;

// super : 부모 클래스 의미
// super.x : 부모 클래스의 은닉된 필드 호출할 때 사용
// super.y : 자식 클래스의 메소드 안에서만 사용
// System.out.println(super.x);	// 오류 발생

class Point2D4 {					// 부모 클래스
	protected int x = 10; // 은닉 변수 혹은 쉐도우 변수
	protected int y = 20;  
}

class Point3D4 extends Point2D4 {	// 자식 클래스
	protected int x = 40; // 슈퍼 클래스에 존재하는 멤버변수를 서브 클래스에 다시 한 번 정의
	protected int y = 50;  

	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z);	// x와 y는 재 정의된 Point3D 클래스 소속
	}

	public void print02() {
		System.out.println(super.x + ", " + super.y + ", " + z);	// Point2D 클래스 소속 멤버변수로 접근
	}
}

class SuperTest04 {
	public static void main(String[] args) {
		Point3D4 pt = new Point3D4();
		pt.print(); 	// 40, 50, 30 // Point3D의 x, y
		pt.print02(); 	// 10, 20, 30 // Point2D의 x, y
	}
}