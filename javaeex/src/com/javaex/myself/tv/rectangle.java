package com.javaex.myself.tv;

public class rectangle {

	protected int width;
	protected int height;
	protected int area = (width*height);
	
	public rectangle( int width, int height) {
		this.width=width;
		this.height=height;
	}


	

	@Override
	public boolean equals(Object obj) {
     if(obj instanceof rectangle) {
    	 rectangle other = (rectangle)obj;
		return this.area == other.area;
	}
		return super.equals(obj);
	}
	
	
}
