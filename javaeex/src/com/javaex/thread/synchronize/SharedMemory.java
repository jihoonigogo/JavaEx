package com.javaex.thread.synchronize;

public class SharedMemory {
	//바깥으로부터 받은 값을 저장해두고 대기
	//필드
	private int memory;

	//getter setter
	public int getMemory() {
		return memory;
	}

	//★임계 영역★ : 여러곳에서 동시에 사용하면 안되는 영역 ! - >synchronized로 막아야함.
	// 사용이 끝날때까지 메서드가 잠긴다.★
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000); //1초 대기
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	} //현재 사용되는 스레드의 이름을 받고 값을 출력함?
	
}
