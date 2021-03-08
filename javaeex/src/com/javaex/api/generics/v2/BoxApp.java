package com.javaex.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {

		//k 가 str
		//v 가 int
		
		

		GenericBox<String,Integer> intBox = new GenericBox();
		intBox.setKey("Integer");
		//intBox.setKey(123); //오류 : 문자열 형태가 선언되어있음
		
		intBox.setContent(2021);
		//intBox.setContent("Java"); 오류 : 정수열 형태가 선언되었음
		
		//값을 호출해보면
		
		int retVal = intBox.getContent()	;
		System.out.println("키 : "+ intBox.getKey()+ retVal);
	
		//int strVal	= intBox.getKey()	;
	
	}
}
