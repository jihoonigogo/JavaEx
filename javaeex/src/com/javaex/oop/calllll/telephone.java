package com.javaex.oop.calllll;

public class telephone extends Phone{

	boolean on;
	
	public telephone (String number, boolean on) {
		super(number);
		this.on = on;
		
	}

	@Override
	public void call() {

		System.out.printf("사무실의 %s 는 032 218 1128 입니다.%n", number);
	}
	
	public void power () {
		
		if( on == true) {
			System.out.println("이 사무실로 전화를 걸고 있습니다");
		}else {
			System.out.println("이 사무실의 전화기가 꺼져있습니다.");

		}
		
	}
	
}
