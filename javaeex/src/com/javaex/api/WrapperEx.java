package com.javaex.api;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		//만들기 
		//Deprecated 되었따. 향후 사용 자제 권고. 다른 방식으로 코딩 권고.
		
		Integer  i = new Integer(10); 
		Float f = new Float(3.14159f);
		
		//valueOf() static 메서드를 이용하자 .
		// 기본타입을 포장해서 객체화 시킴
		Character c = Character.valueOf('c');
		//문자열로 초기화할 수 있다.
		Integer i2 = Integer.valueOf("10");
		
		Float f2 = Float.valueOf("3.14159f");
		Boolean b2 = Boolean.valueOf("false");
		//파라미터로 전달된 문자열이 해당 타입으로 변환 될 수 있는 형태의 문자열 이어야 한다.
		
		//자동박싱이 지원된다.
		
		Integer i3 = 10; // == Integer i3 = Integer.valueOf(10);
		//System.out.println(Integer.parseDouble(i3));
		
		//형변환 메서드
		double d4 = i3.doubleValue()	;
		System.out.println("형변환 : "+ d4);
		
		//유틸리티 메서드
		//parse 계열 메서드 : 문자열을 이용해서 해당 타입으로 변환, 혹은 다른 형태로 출력하는 매서드
		System.out.println(Integer.parseInt("-123")); // 문자열 -123을 정수로 변환한다.
		System.out.println(Integer.parseInt("FF",16)); //16진수 FF를 정수로 변환한다.
		System.out.println(Integer.toBinaryString(28)); //28을 2진수의 문자열로 출력
		System.out.println(Integer.toHexString(28)); //28을 16진수의 문자열로 출력 
		
		//포장 클래스 역시 객체다..
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println(i4 == i5 ) ; // 주소비교 - false
		System.out.println(i4.equals(i5)); //값 비교 - true
		// 언박싱 비교
		System.out.println(i4.intValue()==i5.intValue()); //값의비교2
	}

}
