package com.javaex.oop.casting2;

public class fish extends Animal{

	
	public fish (String name,String place) {
		super(name,place);
	}
	
	public void boongboong() {
		System.out.printf(".... %s 는 말할 수 없습니다%n",name);
	}
	//public void living() {
		//System.out.printf("%s 는 물에 살고 있습니다.%n",name);

	}

