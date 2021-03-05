package com.javaex.oop.summary;

public class kungfuPanda extends panda implements kungfuSkill {

	public kungfuPanda(String name,int age) {
		super(name,age);
	}

	@Override
	public void kungfu() {
		//kungfuskill 내 kungfu 추상메서드 구현
		System.out.println(name + "이 쿵푸를 선보이고 있습니다.");
	}
	
	
}
