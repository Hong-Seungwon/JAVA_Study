package p2022_07_08;

import java.util.*;

public class StackTest01 {
	public static void main(String[] args) {
		
//		스택(Stack) : LIFO(Last Input First Output)구조
		
		Stack myStack = new Stack();
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

//		System.out.println(myStack.pop());	// 4-MFC
//		System.out.println(myStack.pop());	// 3-API
//		System.out.println(myStack.pop());	// 2-C++
//		System.out.println(myStack.pop());	// 1-자바
//		System.out.println(myStack.pop());	// EmptyStackException
		
		
		while (!myStack.isEmpty()) {	// 스택 자료 구조가 비어있지 않으면
			System.out.println(myStack.pop());
		}
	}
}
