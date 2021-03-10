package com.javaex.api.stringclass;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aBcAbCabcABC";
		System.out.println(s1);
		System.out.println(s1.substring(3,4));
		int index = s1.indexOf("abc");
;
		System.out.println(index);
		System.out.println(s1.length());
		System.out.println(s1.replace("a", "R"));
		System.out.println(s1.replace("abc", "123"));
		System.out.println(s1.substring(0,3));
		System.out.println(s1.toUpperCase());



	}

}
