package p2022_06_22;

public class Oper03 {

	public static void main(String[] args) {
		// 비교 연산자 : >, >=, <, <=, ==(같다), !=(같지 않다)
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false값을 리턴
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 = "+result1); // result1 = true
		System.out.println("result2 = "+result2); // result2 = false
		System.out.println("result3 = "+result3); // result3 = true
		
		System.out.println(num1 > num2); 		  // false
		
		char c1 ='A'; // 65(10진수 아스키 코드 값)
		char c2 ='B'; // 66
		boolean result4 = (c1 < c2);
		System.out.println("result4 = "+result4);  // result4 = true
	}
}