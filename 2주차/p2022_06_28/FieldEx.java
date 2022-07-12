package p2022_06_28;

// p202
class FieldInitValue{
	// 필드(Field)
	byte byteField;			// 정수형은 0으로 초기화
	short shortField;		
	int intField;			
	long longField;			
	
	float floatField;		// 실수형은 0.0으로 초기화
	double doubleField;

	boolean booleanField;	// 논리형은 false로 초기화
	char charField;
	
	int[] arrField;			// null로 초기화
	String referenceField;	// null : 참조할 주소가 없다는 의미
}

public class FieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField:"+fiv.byteField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		System.out.println("floatField:"+fiv.floatField);
		System.out.println("doubleField:"+fiv.doubleField);
		System.out.println("booleanField:"+fiv.booleanField);
		System.out.println("charField:"+fiv.charField);
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("referenceField:"+fiv.referenceField);
		
	}

}
