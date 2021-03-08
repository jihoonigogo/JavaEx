package com.javaex.oop.kungfurepeat01;

public class Pong extends Panda implements KungfuSkill {

	public Pong(String name) {
		super(name);
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s 는 쿵푸의 신 입니다.%n", name);

		
	}

	
	
}
