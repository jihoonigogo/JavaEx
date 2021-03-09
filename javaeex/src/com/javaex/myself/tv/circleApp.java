package com.javaex.myself.tv;

public class circleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle a = new circle(6,4,10);
		circle b = new circle(2,12,10);
		circle c = new circle(3,3,12);
		circle d =c;
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));


		
	}

}
