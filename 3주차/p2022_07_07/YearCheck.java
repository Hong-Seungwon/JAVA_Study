package p2022_07_07;

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

//		GregorianCalendar y = new GregorianCalendar();
		Calendar y = new GregorianCalendar();	// 업캐스팅
//		1. 업 캐스팅이 되면 참조 가능한 영역의 축소가 일어남
//		2. 업 캐스팅이 되면 Calendar 클래스가 상속해준 메소드만 접근 가능
		
		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}
	}
}