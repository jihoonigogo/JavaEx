package com.javaex.myself.tv;

public class rectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle a = new rectangle(6,12);
		rectangle b = new rectangle(8,9);
		rectangle c = new rectangle(3,24);
		rectangle d = c;
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));

		
		
		
		
		
	}

}
