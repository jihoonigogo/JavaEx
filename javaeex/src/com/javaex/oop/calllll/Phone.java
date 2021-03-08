package com.javaex.oop.calllll;

public abstract class Phone {

	protected String number;
	
	public Phone(String number) {
		this.number = number;
	}
	
	public abstract void call();
}
