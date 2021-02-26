package com.javaex.basic.types;
/*
 * static final  변수 값을 고정하는 역할 . 상수로 만드는것 /???
 * 이를 참조하고 호출할 수 있으나 값을 변경할 수 없음 
 * 장점 : 
 * 1.유지 보수에 용이
 * 2.보기 편함 
 * 3.변경이 불가능해서 코드의 안정성이 확보된다이
 * 
 *
 */


public class ConstantEx {
	 static final int SPEED_LIMIT =120; //진짜 형ㅌㅐ임
	 
	public static void main(String[] args) {

		final double PI = 3.14159;
		
		System.out.println(PI);
		
		
		final int SPEED_LIMIT = 110; 
		// FINAL 은 할당 이후 변경X
		
		
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도를 초과하였습니까?"+b1);
		
		System.out.println("제한속도는"+SPEED_LIMIT+"입니다");

		
		//SPEED_LIMIT = 100; // 앞서 final로 선언되어서 변경x?
		
		
	}

}
