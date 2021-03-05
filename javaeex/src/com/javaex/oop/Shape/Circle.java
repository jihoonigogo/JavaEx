package com.javaex.oop.Shape;

public class Circle extends Shape {

	//필드
	private double radius; 
	
	//생성자
	
	public Circle( int x, int y , double radius) {
		super(x,y); //x y 필드를 초기화
		this.radius = radius;
	}

	@Override //오버라이딩
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf(
				"원[x=%d, y=%d, r=%.1f, area = %.1f]을 그렸습니다 . %n",
				x,y,radius,area());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = Math.PI*Math.pow(radius, 2);
		return area;
		//return Math.PI * Math.pow(radius, 2);
	}
	
	//추상클래스를 상속받은 진짜 자식 클래스는 부모클래스의 추상메서드를 구현해야함 
	
    
}
