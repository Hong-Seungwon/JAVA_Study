package p2022_07_08;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {

// Map
// 1. 여러가지 자료형의 Data를 모두 저장 가능
// ex) int, double, char, boolean, String etc
// 2. Data를 저장할 때 Key, Value 를 동시에 저장
// 3. key값은 중복 불가 
//    만약에 중복된 key가 있으면, 가장 마지막에 설정된 value값만 사용 가능
// 4. value값은 중복 가능

//		Map 인터페이스는 자체적으로 객체 생성 불가
//		Map m = new Map();		// 오류 발생
		
//		HashMap 객체 생성
		Map hm = new HashMap();	// 업 캐스팅
//		HashMap hm = new HashMap();
		
//		키와 데이터 쌍을 삽입
//		put(Object key, Object value);
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");
		hm.put("city", "busan");

//		HashMap에 있는 객체들을 출력
		System.out.println(hm);

//		키 값만 출력
		System.out.println(hm.keySet());

//		키를 이용해 해당 데이터를 출력
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}