package com.javaex.oop.point.v3;

public class pointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
		point p1 = new point();//기본 생성자
		p1.setX(5);
		p1.setY(10);
		p1.draw();
		p1.draw(false);//오버로딩
		
		point p2 = new point(15,20);//사용자정의
		//p2.setX(15);
		//p2.setY(20);
		p2.draw();
		p2.draw(false);//오버로딩
		
	}

}
