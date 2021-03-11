package com.javaex.thread2;

public class MainThread {

	public static void main(String[] args) {
			//main thread A~Z출력
		Thread thread = new DigiThread(); //여기랑 ★Thread 의 서브클래스로 run을 오버라이딩 ★
		thread.setName("DigiThread");
		//스레드 시작
		thread.start(); //start 내에서 run을 대신 수행하는 것
		
	
		Thread thread2 = new Thread(new AlphabetRunnable()); // ★인터페이스runnable을 구현한 오브젝트를 thread2의 생성자의 파라미터로.★
		thread2.setName("AlphabetRunnable"); // 이유는 start는 run이 실행되기전에 종료되므로 run을 호출하기 위함임. 자신의 run이 아닌 alphabet인스턴스의 run을 머너 호출
		// 생성자 run 메서드가 구현된 runnable 객체 전달
		thread2.start();
		
		//working thread 제어권을 유지하기 위해 
		//작업 흐름을 main thread 로 join 해야함 .★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ㅍ
		try {
			thread.join();//
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		} // thread ,thread2 의 제어권을 갖고 있으며  두 thread 의 작업이 종료 될때까지.
		
		System.out.println("Main thread 종료");
	}

}
