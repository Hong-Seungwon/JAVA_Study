package p2022_06_22;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// if(조건식){
		// 조건식이 참인 경우 실행 될 문장;
		// } else {
		// 조건식이 거짓인 경우 실행 될 문장;
		// }
		
		// 키보드로 입력한 정수가 짝수인지, 홀수인지를 판별하는 프로그램을 작성하세요?
		
		System.out.println("정수를 입력하세요?");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2 == 1 ) { // 홀수
			System.out.println(n+"은(는) 홀수");
		} else {
			System.out.println(n+"은(는) 짝수");
		}
	}
}