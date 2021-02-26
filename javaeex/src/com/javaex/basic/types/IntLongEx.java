package com.javaex.basic.types;

// byte1 short2 int4 long8

public class IntLongEx {

	public static void main(String[] args) {

		int intVar = 2021;
          // 타입의 범위를 넓어가는 값을 할당 x 
		int intVar2;
		//intVar = 123456789012345; //에러 int의 범위를 넘어버림
		
		
		long longVar = 2021;
		
		long longVar2 = 12313123123123123L;
		
		short s1 = 100;
		short s2 = 200;
		
		int result = s1 + s2;
		
		System.out.println(s1 + "+" + s2 +"="+result);
		
		int bin,oct, hex;
		bin = 0b1100; // 0b를 접두어로 쓴다 . 2진수
		oct = 072; // 0을 접두어로 쓴다. 8진수
		hex = 0xFF;// 0x를 접두어로 쓴다. 6진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
