package com.javaex.oop.Shape2;
//자식에게 필드와 메서드를 전달해주는 역할
//추상 내에 기능을자식에게  강제함
public abstract class Shape {
	
	protected int x; // 필드
	protected int y;
	
	public Shape (int x,int y) { //명시적 생성자
		this.x =x;
		this.y=y;
	}
	
	//추상 클래스는 1개 이상의 추상메서드를 갖음
	//추상 메서드는 어떠한 구현도 불가능함 .
	//자식 클래스는 무조건 추상 클래스의 메서드를 구현해야함.
	//public abstract void draw();  -> Drawable interface에 위임함
	public abstract double area();
}
