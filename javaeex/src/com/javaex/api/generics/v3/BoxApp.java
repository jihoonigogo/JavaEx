package com.javaex.api.generics.v3;

public class BoxApp {

	public static void main(String[] args) {

	   //generic 설계된 클래스는 
	   //new 인스턴스화 할때 내부 데이터 타입을 지정한다 .
	   
	   GenericBox<Integer> intBox = new GenericBox<>(); // 앞이나 뒤의 템플릿문자 하나만있어도 된다	
	
	   GenericBox<String> strBox	 = new GenericBox<>(); //문자열 객체만 담김
	   
	   intBox.setContent(2021); // 컾파일러가 체크해줌
	 //  intBox.setContent("Java"); // 정수형만 들어갈 수 있으므로 컴파일러가 잡아줌 안정성확보
	   strBox.setContent("Java");
	   
	   
	   int retVal = intBox.getContent()	; // 다운캐스팅이 불필요함.
	   String retStr = strBox.getContent()	; //캐스팅 불필요
	   
	   System.out.println("제네릭을 이용한 intBox: "+ retVal);
	   System.out.println("제네릭을 이용한 strBox: "+ retStr);

	   System.out.println(retVal+ retStr);

	}
}
