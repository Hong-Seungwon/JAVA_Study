package p2022_07_08;

import java.util.*;

class HashTableTest {
	public static void main(String[] args) {
//		업 캐스팅이 되면 참조 가능한 영역의 축소가 일어나기 때문에 부모가 상속해준 메소드
		
//		Map ht = new Hashtable();		// 업 캐스팅
 		Hashtable ht= new Hashtable();

//		해쉬 테이블에 키/데이터를 입력한다.
// 		put(Object key, Object value);
 		ht.put("딸기", "StrawBerry");		// 업 캐스팅
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");

//		해쉬 테이블의 값을 키를 이용하여 얻는다.
//		Object get(Object key);
//		Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");
		if (Val != null) {
			System.out.println("포도-> " + Val);	// 다운 캐스팅
		}

//		key를 모르는 경우 사용하는 방법
//		열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration Enum = ht.keys();	// Map의 모든 key를 구해주는 역할
		while (Enum.hasMoreElements()) {
			String k = (String)Enum.nextElement();	// 딸기
			String v = (String)ht.get(k);
//			Object k = Enum.nextElement();
//			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
