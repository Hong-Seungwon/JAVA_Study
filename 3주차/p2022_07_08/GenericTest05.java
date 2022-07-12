package p2022_07_08;

class GenericClass<T> {
	private T member;

	public void setValue(T value) {
		member = value;
	}

	public T getValue() {
		return member;
	}
}

class GenericTest05 {
	public static void main(String[] args) {
		
		GenericClass<Double> obj01 = new GenericClass<Double>();
		
		// 자동 박싱 + 업 캐스팅
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅 + 언박싱
		double d= (obj01.getValue()).doubleValue();
//--------------------------------------------------------------------
		GenericClass<Integer> obj02 = new GenericClass<Integer>();
		
		// 자동 박싱 + 업 캐스팅
		obj02.setValue(new Integer(10));
		System.out.println("되돌리는 값은->" + obj02.getValue());

		// 다운 캐스팅 + 언박싱
		int n = (obj02.getValue()).intValue();
//--------------------------------------------------------------------
		GenericClass<String> obj03 = new GenericClass<String>();
		
		// 자동 박싱 + 업 캐스팅
		obj03.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj03.getValue());

		// 다운 캐스팅 + 언박싱
		String s = obj03.getValue();
	}
}