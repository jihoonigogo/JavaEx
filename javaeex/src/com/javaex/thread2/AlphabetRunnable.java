package com.javaex.thread2;
//멀티 스레드 작동방법2
//run 메서드만 구현하고 thread의 생성자의 파라미터로 전달
public class AlphabetRunnable implements Runnable { //상속이 아님

	@Override
	public void run() {
		for(char ch= 'A'; ch<='Z';ch++) {
			
			System.out.println(Thread.currentThread().getName() + ":" + ch);			
			//스레드를 대기 상태로 두기
			try {
			Thread.sleep(300); // 0.3초 동안 대기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
			}
		
	}

	
}
