package com.javaex.thread3;

public class MainThread {

	public static void main(String[] args) {
			//main thread A~Z출력
		//thread의 우선순위를 결정할 수 있다.: thread.@@@_PRIORITY , @@@ =1(min) ~7(normal)~ 10 (max) (순위)
		//Thread 의 우선순위라는 건 cpu의 자원이 부족한 환경에서 우선 실행을 결정하는 것
		
		Thread thread = new DigiThread();
		thread.setName("DigiThread");
		thread.setPriority(thread.MAX_PRIORITY); //10★★★★★★★★★★★★★
		//스레드 시작
		thread.start(); //start 내에서 run을 대신 수행하는 것
		
	
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(thread.MIN_PRIORITY); //10★★★★★★★★★★★★

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
