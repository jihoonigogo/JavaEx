package com.javaex.oop.summary;

public class panda extends Animal {

	public panda(String name,int age) {
		super(name,age);
	}

	@Override
	public void say() { // 부모의 추상메서드
		// TODO Auto-generated method stub
		System.out.println(name + "가 울음소리를 내고 있습니다.....");
	}
	
	
}
