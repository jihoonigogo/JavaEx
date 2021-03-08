package com.javaex.oop.casting2;

public class Circle extends Shape{
	private int radius;

	public Circle( int x , int y,int radius) {
		super(x,y);
		this.radius=radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
		
	}

	@Override
	public void draw() {

		System.out.printf("좌표 x=%d , y=%d 에 반지름은 %d 이며 넓이가 %f인 원을 그렸습니다%n",x,y,radius,area());
	}
	
	
}
