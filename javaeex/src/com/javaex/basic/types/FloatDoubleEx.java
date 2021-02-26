package com.javaex.basic.types;


//float 4바이트 , double 8바이트
//정밀도를 포기하고 표현범위를 넓힌 것 
//표현범위 순 //byte < short < int < long < float < double
public class FloatDoubleEx {

	public static void main(String[] args) {
		
		float floatVar = 3.14159F;
		double doubleVar = 3.14159;
		
		System.out.println(floatVar + doubleVar);
		
		int intVar = 30000000;
		floatVar = 3E7f; // 3*10^7
		doubleVar =314159E-5;
		
		System.out.println("int:" + intVar );
		System.out.println("float:" + floatVar );
		System.out.println("double:" + doubleVar );

		System.out.println(0.1*3);
			}

}
