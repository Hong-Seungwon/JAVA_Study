package p2022_06_30;

// 1) 같은 패키지 안에 들어있는 클래스에 접근 하기 위해서는 접근 제어자가 public이나 default 접근 제어자로 되어야 함
// 2) 같은 패키지 안에 들어있는 클래스에 접근 하기 위해서는 import를 하지 않아도 됨

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called c = new Called();
		c.check();
	}

}
