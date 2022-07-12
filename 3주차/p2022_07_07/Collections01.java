package p2022_07_07;

import java.util.*;

class Collections01 {
	public static void main(String[] args) {
		
//		Set 인터페이스는 자체적으로 객체 생성 불가
//		Set s = new Set();			// 오류 발생
		
		Set set = new HashSet();	// 업 캐스팅
//	HashSet	set = new HashSet();
		System.out.println("요소의 갯수->" + set.size());	// 0
	
//		boolean add(Object e)
		set.add("하나");
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);		// 중복된 데이터 저장 불가능
		System.out.println("요소의 갯수->" + set.size());	// 6
		System.out.println(set);

//		Iterator(반복자) = "하나", 2, 3.42, "넷", "five", 6
		Iterator elements = set.iterator();
		while (elements.hasNext()) {	// 가져올 데이터가 있을 때 true 리턴
			System.out.println("\t\t" + elements.next());
		}

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}