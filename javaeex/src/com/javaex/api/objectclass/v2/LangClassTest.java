package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		point p1 = new point(10,10);
		
		point p2 = new point(10,10);
		
		point p3 = p2; // 값과 주소가 같아짐
		
		//참조타입의 == : 주소비교임
		//참조타입의 값의 비교 : .equals();
		
		System.out.println("p1 이랑 p2는 같은 객체 일까 ?"+ (p1==p2)); // 주소 비교
		System.out.println("p1 이랑 p2는 같은 값 일까 ?"+ p1.equals(p2)); // 값 비교 
		System.out.println("p2 이랑 p3는 같은 값 일까 ?"+ p2.equals(p3)); // 값 비교 
		System.out.println("p2 이랑 p3는 같은 값 일까 ?"+ (p2==p3)); // 주소 비교  F

		// 값이 다른 이유는 ?  비교 방법을 자바에게 알려주지 않아서 !!
	}

}
