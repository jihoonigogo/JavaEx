package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//스택 자료형은 가장 나중에 input 된게 가장 빠르게 output 된다.
		// LAST IMPUT FIRST OUTPUT  = LIFO
		// FIRST INPUT FIRST OUT = QUEUE
		
		Stack<Integer> stack	= new Stack<>();
		System.out.println("STACK : "+ stack);
		
		//데이터 제공
		for (int i = 0; i<10; i++) {
			stack.push(i);
			System.out.println("STACK : "+ stack);

		}
		
		//PEEK 최상위 데이터 확인	
		System.out.println("PEEK : "+ stack.peek());
		System.out.println("STACK : "+ stack);

		//POP 최상위 데이터 확인 후 없앰
		Integer item = stack.pop()	;
		System.out.println("pop : "+ item);
		System.out.println("STACK : "+ stack);
		//System.out.println("POP : "+ stack.pop());
		//System.out.println("STACK : "+ stack);

		//순회
		while(!stack.empty()) {
			System.out.println("POP : "+ stack.pop());
			System.out.println("STACK : "+ stack);

		}
	}

}
