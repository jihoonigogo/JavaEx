package com.javaex.oop.summary;

public class human extends Animal{
	
	public human (String name,int age) {
		super(name,age);
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.printf(name + "가 무언가를 말하고 싶어합니다.....%s",name);

	}

	
}
