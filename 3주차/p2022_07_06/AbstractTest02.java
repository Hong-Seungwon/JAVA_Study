package p2022_07_06;

// 메소드의 다형성 : 메소드 이름은 동일하지만, 각 메소드의 동작하는 내용이 서로 다르게 동작하는 것을 의미
abstract class ShapeClass {					// 추상 클래스
	abstract void draw();					// 추상 메소드
}

class Circ extends ShapeClass {
	void draw() {							// 메소드 오버라이딩
		System.out.println("원을 그린다");
	}
}

class Rect extends ShapeClass {
	void draw() {							// 메소드 오버라이딩
		System.out.println("사각형을 그린다");
	}
}

class Tria extends ShapeClass {
	void draw() {							// 메소드 오버라이딩
		System.out.println("삼각형을 그린다");
	}
}

public class AbstractTest02 {
	public static void main(String args[]) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();

		c.draw();
		r.draw();
		t.draw();
	}
}