package com.javaex.oop.summary;

public class theOne extends human implements kungfuSkill, Flyable{
	
	public theOne(String name,int age) {
		super(name,age);	
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": i do know kungfu!");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(name + ": and even i can fly");

	}

	
}
