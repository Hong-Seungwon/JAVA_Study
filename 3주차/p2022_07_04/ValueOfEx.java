package p2022_07_04;

public class ValueOfEx {

	public static void main(String[] args) {
// p511
// valueOf() : 기본 자료형을 문자열로 변환
// 				ex) 20 -> "20"
		
		String str1 = String.valueOf(10);		// 10 - > "10"
		String str2 = String.valueOf(10.5);		// 10.5 - > "10.5"
		String str3 = String.valueOf(true);		// true - > "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
