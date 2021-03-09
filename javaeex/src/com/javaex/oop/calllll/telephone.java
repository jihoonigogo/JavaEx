package com.javaex.oop.calllll;

public class telephone extends phone{

	
public telephone(String number) {
	super(number);
}


public void power(boolean on) {
	if(on==true) {
		System.out.println("전원이 켜져있습니다.");
	}else {
		System.out.println("전원이 꺼져있습니다.");

	}
	
}


@Override
public void call() {
	System.out.printf("%d 로 전화를 걸고 있습니다.", number);
}
}
