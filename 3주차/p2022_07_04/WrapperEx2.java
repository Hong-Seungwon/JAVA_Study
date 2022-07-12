package p2022_07_04;

public class WrapperEx2 {

	public static void main(String[] args) {
// p529
		// 박싱
		Integer obj01 = new Integer(100);
		Integer obj02 = new Integer(200);
		Integer obj03 = Integer.valueOf(300);
		
		// 언박싱
		int value1 = obj01.intValue();
		int value2 = obj02.intValue();	// 자료형 변환 : "200" -> 200
		int value3 = obj03.intValue();	// 자료형 변환 : "300" -> 300
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
