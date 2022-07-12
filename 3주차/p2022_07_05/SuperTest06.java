package p2022_07_05;

// super()
// 1. super()는 부모 클래스의 매개변수를 가진 생성자 호출할 때 사용
// 2. super()는 자식 클래스 생성자 안에서 첫번째 라인에 사용
// 3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면, 더이상 부모 클래스의 기본 생성자를 호출 x

class Point2D06 {						// 부모 클래스
	protected int x = 10;				// 필드
	protected int y = 20;

	// 매개변수가 있는 생성자가 있을 때는 예외적으로 컴파일러가 기본 생성자를 생성해주지 않음
	public Point2D06() {				// 기본 생성자
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}

	public Point2D06(int xx, int yy) {
		x = xx;		// 50
		y = yy;		// 60
	}
}

class Point3D06 extends Point2D06 {		// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z);
	}

	public Point3D06() {				// 기본 생성자
		super(50, 60);	// 부모 클래스의 매개변수가 있는 생성자 호출 
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();
	}
}