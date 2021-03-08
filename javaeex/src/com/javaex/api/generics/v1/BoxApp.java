package com.javaex.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {

		IntBox intBox = new IntBox();
		intBox.setContent(2021);
		
		
		
		int retVal = intBox.getContent()	;
		System.out.println("내용물 : "+ retVal);
	

	
	    StringBox stringBox = new StringBox();
	    stringBox.setContent("Java");
	    String strVal = stringBox.getContent()	;
	    
		System.out.println("내용물 : "+ strVal);
		
		
	   ObjectBox objBox = new ObjectBox	();
	   objBox.setContent(2021);
	   
	   ObjectBox objBox2 = new ObjectBox	();
	   objBox2.setContent("Java");
	   
	   System.out.println(objBox);
		
	   // 내용물 확인
	   //내부 데이터가 obj이므로 java 컴파일러가 체크하기 힘들다.
	   // 데이터를 호출할때 캐스팅이 필요함. 불편하고 위험하다.
	   Integer retVal2 = (Integer)objBox.getContent()	; // obj 타입 반환이므로 다운캐스팅
	}
}
