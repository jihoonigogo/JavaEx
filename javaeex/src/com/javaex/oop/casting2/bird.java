package com.javaex.oop.casting2;

public class bird extends Animal{
	
	public bird (String name , String place) {
		super(name,place);
	}

	public void howling() {
		System.out.printf("%s 는 짹짹 하고 울고 있습니다", name);
	}
}
