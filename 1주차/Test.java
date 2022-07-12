import java.util.Date;
import java.util.Random;

public class Test {
//접근제어자	  사용자 정의 클래스
	
// main() 메소드는 자바가상머신(JVM, java.exe)이 가장 먼저 호출하는 메소드
// 1개의 클래스가 독립적으로 실행되기 위해서는 main메소드가 반드시 필요
	public static void main(String[] args) {
//  접근제어자 공유               main 메소드
		// TODO Auto-generated method stub
		
		System.out.print("자바출력 성공1");
		System.out.println("자바출력 성공2");
		
		Date d = new Date();
		System.out.println(d);
		
		Random r = new Random();
		System.out.println(r.nextInt(10)); //0 ~ 9
		}
}
// 자바의 주석
// 1. 단일행 주석 : //
// 2. 다중행 주석 : /*    */

// 이클립스 단축키
// 실행 : Ctrl + F11
// 주석 처리 : Ctrl + /
// 블럭 주석 처리 : Ctrl + Shift + /
// 블럭 주석 해제 : Ctrl + Shift + \
// 복사 : Ctrl + Alt + 아래 방향키
// 이동 : Alt + 방향키
// 한 줄 삭제 : Ctrl + d
// 자동 import : Ctrl + Shift + O