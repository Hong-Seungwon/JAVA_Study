package p2022_06_28;

//  p201
class Car{
	// 필드(field)
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {	// 기본 생성자
		System.out.println("생성자 호출 성공");
	}
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		CarEx car = new CarEx();
		Car myCar = new Car();	// 객체를 생성할 때 생성자가 호출
		
		// 필드값 읽기
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);	// 0
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도:"+myCar.speed);	// 60
	}

}
