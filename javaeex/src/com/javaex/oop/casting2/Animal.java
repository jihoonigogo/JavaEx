package com.javaex.oop.casting2;

public class Animal {

	//필드
	protected String name;	
	protected String place;
	
	//생성자
	public Animal (String name,String place) {
		this.name = name;	
		this.place = place;

	}
	
	public void living() {
		System.out.printf("%s 는 %s에 살고 있습니다.", name,place);
	}

}
