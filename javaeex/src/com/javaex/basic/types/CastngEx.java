package com.javaex.basic.types;
/*
 *  byte 1 < short 2 < int 4 < long 8 < float 4 < double 8
 *                    char 2
 */
public class CastngEx {

	public static void main(String[] args) {

		implicitCastingEx();
		explicitCastingEx();
	}

	private static void explicitCastingEx() {
	// 넓은 자료를 좁은 자료형으로 표현하기 -> 데이터 유실 가능성있음
		// 개발자가 명시적으로 타입변환 필요
		double d = 1234.456;
		System.out.println(d);
		
		float f = (float)d; // 4바이트가 8바이트 담기
		System.out.println(f);
		
		long l = (long)f; // 8바이트 정수형
		System.out.println(l);

		
	}
	/*
	 * 암묵적 캐스팅 (implicit casting : promption)
	 * 자료의 표현 범위가 좁은걸 -> 넓게  : 자바가 자동으로 해줌 
	 * 반대로 넓은걸 -> 좁게 할때는 
	 */
	private static void implicitCastingEx() {
		byte b = 25; //1바이트

		System.out.println(b);
		
		short s = b; //2바이트
		System.out.println(s);
		
		int i = s; //4바이트 
		System.out.println(i);

        long l = i; //8바이트
		System.out.println(l);

		float f = l; //4byte 바이트 수는 l보다 작지만 표현범위가 큼
		System.out.println(f);

		double d = f; //8byte
		System.out.println(d);

		
	}
}
