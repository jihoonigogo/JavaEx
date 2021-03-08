package com.javaex.oop.kungfurepeat01;

public class Human extends Animal{
	
	public Human (String name) {
		super(name);
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.printf("%s 가 무언가 말하려고 합니다 %n",name);
	}
	
}
