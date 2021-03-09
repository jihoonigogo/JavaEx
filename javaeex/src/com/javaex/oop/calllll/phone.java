package com.javaex.oop.calllll;

public abstract class phone {

	protected String number;
	
	
	public phone(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public abstract void call ();
	
}
