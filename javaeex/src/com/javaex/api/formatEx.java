package com.javaex.api;

import java.util.Formatter;

public class formatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer(); // 데이터 타입은 스트링버퍼
		Formatter f = new Formatter(sb); //import 해주면서 데이터타입 변수를 넣어준다.
		int age = 100;
		String name = "lucifer";
		f.format("%s는 나이가 %d 살이라던데요 ?" ,name,age);
		System.out.println(f);
		
		String s = String.format("%s는 나이가 %d살이라던데요 ?%n", name,age);
		System.out.println(s);

	}

}
