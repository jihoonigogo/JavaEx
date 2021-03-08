package com.javaex.oop.kungfurepeat01;

public class Me extends Human implements KungfuSkill ,Flyable {

	public Me(String name) {
		super(name);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.printf("%s 는 날 수 있습니다%n", name);
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s 는 쿵푸의 고수 입니다.%n", name);

	}
	
}
