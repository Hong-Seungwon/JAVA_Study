package p2022_07_08;

class TestClass2 {
	private Object member;

	public void setValue(Object value) {
		member = value;
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();

		// Object value = new Integer(3); 업 캐스팅 + 박싱
		// Object value = 3; 업 캐스팅 + 자동 박싱
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅 + 언박싱
		int n = ((Integer) (obj01.getValue())).intValue();
//---------------------------------------------------------------
		// Object value = new Double(3.4); 업 캐스팅 + 박싱
		// Object value = 3.4; 업 캐스팅 + 자동 박싱
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅 + 언박싱
		double d = ((Double) (obj01.getValue())).doubleValue();
//----------------------------------------------------------------
		// Object value = new String("이해할 수 있다."); 업 캐스팅 + 박싱
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅
		String str = (String) obj01.getValue();
	}
}