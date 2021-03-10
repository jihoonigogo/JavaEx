package com.javaex.thread2;

public class MainThread {

	public static void main(String[] args) {
			//main thread A~Z출력
		Thread thread = new DigiThread();
		thread.setName("DigiThread");
		//스레드 시작
		thread.start(); //start 내에서 run을 대신 수행하는 것
		
	
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		// 생성자 run 메서드가 구현된 runnable 객체 전달
		thread2.start();
		
		//working thread 제어권을 유지하기 위해 
		//작업 흐름을 main thread 로 join 해야함 .
		try {
			thread.join();//
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		} // thread ,thread2 의 제어권을 갖고 있으며  두 thread 의 작업이 종료 될때까지.
		
		System.out.println("Main thread 종료");
	}

}
