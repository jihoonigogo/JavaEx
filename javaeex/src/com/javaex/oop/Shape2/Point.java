package com.javaex.oop.Shape2;

//인터페이스는 여러개를 구현할수있음
//인터페이스 내에있는 추상 클래스의 메서드 draw를 구현해야함 (오버라이드 , 강제)
public class Point implements Drawable{
	
 
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point (int x , int y) {
		
		this.x=x;
		this.y=y;
	}

	@Override
	public void draw() {

		System.out.printf("점[ x = %d , y =%d]을 그렸습니다%n", x,y);
	}
	
	
}
