package com.javaex.thread.synchronize;

public class User extends Thread {

	private SharedMemory memory;
	private int data;
	//생성자
	public User(String name,SharedMemory memory ,int data) {
		this.setName(name);//스레드 이름
		this.memory = memory; //공유 객체
		this.data = data;
		
	}
	@Override
	public void run() {
		if(memory != null) { //비어있지않으면
			memory.setMemory(data);//메모리에 내가 갖고 있는 데이터를 넣어줌
			
		}
	}
	
	
}
