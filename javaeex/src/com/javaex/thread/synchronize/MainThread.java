package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {

		SharedMemory memory = new SharedMemory();
		//쓰레드생성
		User user1 = new User("철수",memory,100);
		User user2 = new User("영희", memory ,50);
		
		
		user1.start();
		user2.start(); 
		//1.철수영희 둘다 50값을 갖는다?  왜 ~? sleep 1000 중간에 영희가 set함
		//2.여러 메서드가 공유 객체에 동시에 접근해서는 안되는 것.
		//user1이 먼저 사용이 끝날때 까지 접근을 제한해야함.
	}

}
