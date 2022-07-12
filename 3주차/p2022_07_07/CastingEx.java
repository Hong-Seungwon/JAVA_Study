package p2022_07_07;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
//		레퍼런스 형변환 : 두개의 클래스 사이에 상속 관계가 있어야 함

// 		업 캐스팅(자동 형변환)
// 		1. 서브 클래스에서 슈퍼 클래스로 형변환 하는 것
// 		2. 참조 가능한 영역이 축소가 됨
// 		3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 됨		
		
// ex1.
//		Calendar c = new Calendar();			// 오류 발생
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();	// 업 캐스팅
//		업 캐스팅이 되면 참조 가능한 영역의 축소가 일어남(Calendar 클래스에서 상속해줄 메소드만 접근 가능)
		
		GregorianCalendar c3 = new GregorianCalendar();
		
//		boolean isLeapYear(int year)
//		1. 업 캐스팅이 되면 부모 클래스에서 상속해준 메소드만 접근 가능
//		2. isLeapYear() 메소드는 Calendar 클래스에서 상속해준 메소드가 아니기 떄문에 사용 불가
		
//		if(c2.isLeapYear(2020)) {}				// 오류 발생
		if(c3.isLeapYear(2020)) {}				// 정상 처리
		
// ex2. List 인터페이스는 자체적으로 객체 생성 가능
//		List li = new List();					// 오류 발생
		
		List list = new ArrayList();			// 업 캐스팅
		ArrayList al = new ArrayList();
		
// ex3. 
//		add(Object e)
		list.add(10);		// Object e = new Integer(10) 박싱 + 업 캐스팅
		list.add(3.14);		// Object e = new Double(3.14) 박싱 + 업 캐스팅
		list.add("j");		// Object e = new Character("j") 박싱 + 업 캐스팅
		list.add(true);		// Object e = new Boolean(true) 박싱 + 업 캐스팅
		list.add("자바");		// Object e = new String("자바") 박싱 + 업 캐스팅
	
// ex4. boolean equals(Object an)
		
//		Object an = new String("java");			// 업 캐스팅
		if("java".contentEquals(new String("java"))) {
			System.out.println("값은 값");
		} else {
			System.out.println("다른 값");
		}
		
//		Object an = new Integer(30);			// 업 캐스팅 + 박싱
//		Object an = 30;							// 업 캐스팅 + 박싱
		if(new Integer(10).equals(new Integer(30))) {
			System.out.println("값은 값");
		} else {
			System.out.println("다른 값");
		}

//		Object an = new Double(3.14);			// 업 캐스팅 + 박싱
//		Object an = 3.14;							// 업 캐스팅 + 박싱
		if(new Double(10).equals(new Double(3.14))) {
			System.out.println("값은 값");
		} else {
			System.out.println("다른 값");
		}

//----------------------------------------------------------------
//		다운 캐스팅(강제 형변환)
//		1. 슈퍼 클래스에서 서브 클래스로 형변환 하는 것
//		2. 참조 가능한 영역이 확대 됨
//		3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기 때문에 자료형 생략 불가(강제 형변환)
		
// ex1. 
		List lt = new ArrayList(); 				// 업 캐스팅
		
//		add(Object e)
		lt.add(new String("자바"));				// 업 캐스팅
		lt.add("오라클");
		lt.add("JSP");
		lt.add("웹표준");
		lt.add("스프링");
		lt.add("파이썬");
		lt.add("텐서플로우");
		
//		Object get(int index)
		System.out.println(lt.get(0));
		
		for(int i=0; i<lt.size(); i++) {
//			Object o = lt.get(i);
			
			String str = (String)lt.get(i);		// 다운 캐스팅
			System.out.println(str);
		}

// ex2. 
		List ls = new ArrayList();				// 업 캐스팅
		
// 		add(Object e)
		ls.add(10);								// 자동 박싱 + 업 캐스팅
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);
		
		
//		Object get(int index)
		for(int i=0; i<ls.size(); i++) {
//			Object obj = lse.get(i)
			
			Integer it = (Integer)ls.get(i);			// 다운 캐스팅
			int n = it.intValue();						// 언박싱
			
			int n1 = ((Integer)ls.get(i)).intValue();	// 다운 캐스팅 + 언박싱
			System.out.println(n);
			
		}
	}
}