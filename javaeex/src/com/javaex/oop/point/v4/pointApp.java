package com.javaex.oop.point.v4;

public class pointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
		point p1 = new point(5,10);//기본 생성자
		p1.draw();
		p1.draw(false);//오버로딩
		
		point p2 = new point(15,20);//사용자정의
		p2.draw();
		p2.draw(false);//오버로딩
		
		
		colorPoint cp = new colorPoint(20,40,"검정");
		cp.draw();
		cp.draw(false);
		
		System.out.println("==============");
		colorPoint cp2 = new colorPoint(30,40,"빨강");
		cp.draw();
		
		//부모타입으로 자식을 참조할 수 있다
		point cp3 = new colorPoint(50,100,"파랑");
		cp.draw();
		
	}

}
