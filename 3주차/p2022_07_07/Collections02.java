package p2022_07_07;

import java.util.ArrayList;
import java.util.List;

class Collections02 {

	public static void main(String[] args) {
//		List 인터페이스느 자체적으로 객체 생성 불가
		List li = new List();			// 오류 발생
		
//  	List list = new ArrayList();	// 업 캐스팅
		ArrayList list = new ArrayList();
		
//		boolean add(Object e)
		list.add("하나");
		list.add(2);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
