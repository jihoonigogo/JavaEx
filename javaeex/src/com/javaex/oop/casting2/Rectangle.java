package com.javaex.oop.casting2;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int x , int y , int width , int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return (width*height);
	}

	@Override
	public void draw() {
		System.out.printf("좌표 x=%d , y=%d 에 너비는%d, 높이 %d이고 넓이가 %.2f인 사각형을 그렸습니다%n",x,y,width,height,area());
		
	}

	
}
