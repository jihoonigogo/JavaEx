package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FIRST IN FIRST OUT FIFO
		// QUEUE는 인터페이스. 실체 클래스는 LIST관련 클래스 - > 임포트 필요(?)
		Queue<Integer>	queue = new LinkedList<>();
		
		
		//데이터 제공
		for(int i = 0 ; i <10; i++) {
			queue.offer(i);
			System.out.println("QUEUE : "+ queue);
		}
		
		
		//데이터확인	
		Integer item = queue.peek()	; // 인출은 아님
		System.out.println("peek : "+ item);
		System.out.println("QUEUE : "+ queue);
		item=queue.poll(); // 데이터 인출	
		System.out.println("POLL : "+ item);
		System.out.println("QUEUE : "+ queue);
		
		//poll을할때 
		//empty 확인해야함
		while(!queue.isEmpty()) {
			System.out.println("POLL : "+ queue.poll());
			System.out.println("QUEUE : "+ queue);


		}


	}

}
