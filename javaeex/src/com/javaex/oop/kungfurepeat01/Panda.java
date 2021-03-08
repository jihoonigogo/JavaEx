package com.javaex.oop.kungfurepeat01;

public class Panda extends Animal {

	public Panda(String name) {
		super(name);
	
	}

	@Override
	public void say() {
		System.out.printf("%s 가 무언가 말하려고 합니다.. 하지만 %s의 언어를 모릅니다.%n",name,name);
		
	}
	
}
