package com.javaex.oop.staticmember;

// 미션 : 어떤 상황에서도 단 하나의 인스턴스만 유지
// 1.생성자에 대한 접근을 막는다 .

public class Singleton {
	//static 영역에 단 하나의 인스턴스객체를 담아두면 된다?
	private static Singleton instance = new Singleton();
	
	//생성자
	private Singleton() {
		//어떻게 해도 호출할 수 없음 
		// new 호출 불가
	}

	public static Singleton getInstance() {
		return instance;
	}
}
