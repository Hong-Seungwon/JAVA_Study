package p2022_07_08;

import java.util.*;

class Collections06 {
	public static void main(String[] args) {
		
//		제네릭(Generic) : 한가지 자료형의 데이터만 저장하도록 해줌
		Vector<String> vec = new Vector<String>();

		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);	// String형 데이터만 저장 가능
		
//		제네릭을 사용하게 되면, 자료 구조에 데이터를 구해올 때 자료형을 생략 가능
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);
			System.out.println(temp.toUpperCase());
		}
	}
}
