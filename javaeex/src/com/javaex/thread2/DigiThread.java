package com.javaex.thread2;

//방법1  thread 상속하기 
// 장점 1 : 스레드 내부 로직을 정밀하게 제어가능	

public class DigiThread extends Thread {

	@Override
	public void run() {
		//실제 스레드의 실행로직
		for(int i=1; i<=30; i++) {
			System.out.printf("%s : %d%n", getName(), i	);
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

	
}
