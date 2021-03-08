package com.javaex.oop.calllll;

public class Smartphone extends Phone {
	
	private String url;
	
	public Smartphone (String number , String url){
		super(number);
		this.url  = url;
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.printf("저의 %s 는 010 2338 6029 입니다.%n혹시 잊어버리셨다면 %s에 있습니다", number,url);
	}

	public void power() {
		
	}
}
