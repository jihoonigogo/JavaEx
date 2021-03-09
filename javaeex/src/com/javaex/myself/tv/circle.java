package com.javaex.myself.tv;

public class circle {

	protected int x ;
	protected int y;
	protected int radius;
	
	public circle(int x, int y, int radius) {
		this.x = x;
		this.y=y;
		this.radius=radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof circle) {
			circle other = (circle)obj;
			return this.radius == other.radius;
		}
		return super.equals(obj);
	}


	
	
}
