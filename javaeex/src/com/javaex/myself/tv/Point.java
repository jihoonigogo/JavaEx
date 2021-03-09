package com.javaex.myself.tv;

public class Point {

	protected int x;
	protected int y;
	
	public Point() {
		
	}
	public Point (int x , int y) {
		this.x =x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점은 x= %d , y= %d에 있습니다.", x,y);
	}
	public void draw(boolean show) {
		String message = String.format("점 x= %d, y=%d를 ", x,y);
	if (show) {
		message += "그렸습니당";
	}else {
		message+="지워버렸습니다";
	}
	 System.out.println(message);
	}
}
