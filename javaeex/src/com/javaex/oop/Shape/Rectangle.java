package com.javaex.oop.Shape;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle (int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {

		System.out.printf(
				"사각형 [X=%d , Y= %d , width = %d , height =%d , area =%.1f]을 그렸습니다%n",x,y,width,height,area()
				);
		
	}

	@Override
	public double area() {
		
		
		return width * height;
	}

	
}
