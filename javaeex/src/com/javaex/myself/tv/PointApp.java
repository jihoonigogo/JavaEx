package com.javaex.myself.tv;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(4,4);
		//ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		p.draw();
		p.draw(false);
		cp2.draw();
		cp2.draw(false);
	}

}
