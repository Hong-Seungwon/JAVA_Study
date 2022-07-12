package p2022_07_04;

public class WrapperEx3 {

	public static void main(String[] args) {
// p530
// 자동 박싱과 자동 언박싱
		
		// 자동 박싱
		Integer oj = new Integer(10);	// 박싱
		Integer obj = 10;				// 자동 박싱
		System.out.println("언박싱:"+(obj.intValue()+10));
		System.out.println("자동언박싱:"+obj);
		
		// 언박싱
		int value1 = obj.intValue();
		
		// 자동 언박싱
		int value2 = obj;
		System.out.println("value2:"+value2);

		// 자동 언박싱
		int result = obj + 100;
		System.out.println("result:"+result);
		
	}

}
