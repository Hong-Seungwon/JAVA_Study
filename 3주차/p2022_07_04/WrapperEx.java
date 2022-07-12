package p2022_07_04;

public class WrapperEx {

	public static void main(String[] args) {
		// int형 변수의 최대값과 최소값
		System.out.println("max="+Integer.MAX_VALUE);
		System.out.println("min="+Integer.MIN_VALUE);
		
		// String형을 int형으로 형변환 : "20" -> 20
		int n = Integer.parseInt("20");
		System.out.println(n);		// 20 : 숫자
		System.out.println(n+10);	// 30 : 산술연산 가능
		
		// 10진수를 2진수로 변환
		System.out.println("2진수:"+Integer.toBinaryString(10));

		// 10진수를 8수로 변환
		System.out.println("2진수:"+Integer.toOctalString(10));
		
		// 10진수를 16진수로 변환
		System.out.println("2진수:"+Integer.toHexString(10));
		
		
		
	}

}
