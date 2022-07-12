package p2022_07_07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
// TreeSet
// 1. TreeSet은 중복된 데이터 저장 불가능
// 2. 데이터를 오름차순으로 정렬해서 저정하고, 출력하는 기능 제공
	
//		오름차순 정렬
//------------------------------------------------------
// 숫자 : 작은 숫자부터 큰 숫자 순으로 정렬 ex) 1, 2, 3...
// 문자 : 사전 순으로 정렬 ex) a, b, c...
	
	/**
	 * HashSet 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();
		
		if(hs.add("korea")){
			System.out.println("첫 번째 korea 추가 성공");
		}
		else{
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}
		else{
			System.out.println("japan 추가 실패");
		}
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}
		else{
			System.out.println("america 추가 실패");
		}
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}
		else{
			System.out.println("britain 추가 실패");
		}
		if(hs.add("korea")){	// 중복된 데이터 저장 불가
			System.out.println("두 번째 korea 추가 성공");
		}
		else{
			System.out.println("두 번째 korea 추가 실패");
		}
		
		// 오름차순으로 정렬된 결과 출력
		System.out.println(hs);
		
		// 반복자 : america, britain, japan, korea
		Iterator it = hs.iterator();
		while(it.hasNext()){	// 가져올 데이터가 있으면 true 리턴
			System.out.println(it.next());
		}		
	}
}
