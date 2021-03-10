package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
			//main thread A~Z출력
		Thread thread = new DigiThread();
		thread.setName("DigiThread");
		//스레드 시작
		thread.start(); //start 내에서 run을 대신 수행하는 것
		
		//주의
		// thread.run(); // run 메서드를 일반 메서드로 run을 수행한것..
			//메인과 다른 별로의 작업 흐름 만들기  digital thread 1~30카운트
		for(char ch= 'A'; ch<='Z';ch++) {
			System.out.println("Main thread : " + ch);
			
			//스레드를 대기 상태로 두기
			try {
			Thread.sleep(300); // 0.3초 동안 대기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
			}
	}

}
