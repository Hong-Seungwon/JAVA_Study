package p2022_06_29;

import java.util.Scanner;

// p232
// 메소드 오버로딩(Method Overloading)
// : 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의
// 메소드 오버로딩 조건 : 매개변수의 데이터 타입, 개수, 순서

class Calculator2{
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 cal = new Calculator2();
		
		// 정사각형의 넓이
		double result1 = cal.areaRectangle(10);

		// 직사각형의 넓이
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이:"+result1);
		System.out.println("직사각형의 넓이:"+result2);
		
		
	}

}
