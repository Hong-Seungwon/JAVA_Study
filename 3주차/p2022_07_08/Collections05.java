package p2022_07_08;

import java.util.*;

class Collections05 {
	public static void main(String[] args) {

//		제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장 가능
		Vector vec = new Vector();
		
//		boolean add(Object e)
		vec.add("Apple");				// 업 캐스팅
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);
		
//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // 다운 캐스팅
//			temp=vec.get(i);			// 오류 발생
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
