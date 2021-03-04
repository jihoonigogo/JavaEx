package com.javaex.oop.practicepoint01;

public class point {

	private int x;
	private int y;
	
	public point () {
		
	}
	public point (int x,int y) {
		x=0;
		y=0;
	}
	
	public int getX() {
		return x;			
	}	
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]를 지도에 그렸습니다%n", x,y);
	}
	
}
