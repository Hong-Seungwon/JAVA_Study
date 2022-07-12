package p2022_07_08;

import java.util.*;

public class StackTest {
	public static void main(String[] args) {
//		스택(Stack) : LIFO(Last Input First Output)구조
		
//		Stack 객체 생성
		Stack s = new Stack();
		System.out.println(s.empty());	// 비어 있으면 true

//		Stack에 값을 넣음
		s.push("gemini");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("johnharu");

//		Stack의 값을 출력
		System.out.println(s.empty());	// false
		
//		peek() : 가장 마지막의 데이터를 구해오는 역할
		System.out.println(s.peek());	// johnharu
		
//		pop() : 가장 마지막의 데이터를 출력하는 역할
		System.out.println(s.pop());	// johnharu
		System.out.println(s.pop());	// 10
		System.out.println(s.pop());	// Fri Jul 08 12:46:30 KST 2022
		System.out.println(s.pop());	// gemini
		System.out.println(s.empty());	// true
	}
}