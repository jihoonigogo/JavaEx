package com.javaex.basic;

public class OperEx {

	public static void main(String[] args) {
/*
 * 
 
		arithOperEx();
		logicalOperEx();
		bitOperEx();
		bitShiftEx();
		
*/
		
		conditionalOperEx();
	
		
	}
	//3항 연산자 간단한 조건문임.
 
	private static void conditionalOperEx() {
		int a = 10; // 만약에 a가 짝수면 "짝수 ", 홀수면 "홀수 "
		boolean condi1 = a%2 == 0;
		
		String result = a%2 ==0?  "짝수 ":"홀수";
		//System.out.println(a + "is 짝수 ?" + result);
		
		int score = 40;
		//만약 스코어가 80이상이면 good 
		//80 > score >50 : pass 
		// 나머지 :fail
		
		String message = score >=80? "good": score >50? "pass":"fail";
		
		System.out.println("당신의 점수는 ?" + score + " 점수는 바로 " +message);
		
		if(score >80) {
			System.out.println("good");
		}else if(score>50) {
			System.out.println("hmm");
		}else {
			System.out.println("nooooo");
		}
		
		
		
		
	}
	// 비트 시프트 연산자
	// 비트단위 이동 << 왼쪽이동 다음에 나오는 수만큼 2의 제곱 곱하기 ?
	// >> ㅇ른쪽 이동 수 만큼 2의 제곱 나누기
	private static void bitShiftEx() {
		int val = 1;
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val <<1)); // 왼쪽으로 1비트 이동0b01 -> 0b10
		System.out.println(Integer.toBinaryString(val <<2));
		
		val = 0b1000;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >>1));
		System.out.println(Integer.toBinaryString(val >>2));




	}
	// 비트 연산자 ( & | ~)
	// Int 만 적용가능하며 비트 단위의 미세조정에 사용된다.
	private static void bitOperEx() {
		
		
	int b1 = 0b1101 ;
	int b2 = 0b0111;
	System.out.println(Integer.toBinaryString(b1));
	System.out.println(Integer.toBinaryString(b2));

	
	int result = b1 &b2; //비트 논리곱0b0101
	System.out.println(Integer.toBinaryString(result));
	result = b1 |b2; // 비트 논리합 0b1111
	System.out.println(Integer.toBinaryString(result));
	result = ~b1; // 비트 논리부정
	System.out.println(Integer.toBinaryString(result));


	}
	
	
	
	
	
	
	
	
	
	
	
	//비교 논리 연산 => boolean 을 뽑아냄 
	private static void logicalOperEx() {
		//비교 연ㅅ나자  ==, !=, > , >= ,< ,<=
		
		int a = 7;
		int b = 3;
		
		System.out.println("a>b?" + (a>b));
		System.out.println("a equals b ? " + (a==b));
		System.out.println("a not equals b ? " + (a!=b));

		//논리연산 and(&&) , or(\\) , not (!)
		//집합론 
		int val =5;
		// val 이 0초과 10미마의 영역에 존재하는가 
		// condition 1 : val > 0
		// condition 2 : val < 10
		// c1 and c2  == c1 && c2
		
		boolean r1 = val >0 ;
		boolean r2 = val < 10;
		boolean r1andr2 = r1 && r2;
		
		System.out.println(r1andr2);

		//val <= 0 , val >=10
		//con1  : val <=0
		//con2 : val >10
		//c1 or c2 == c1 || c2
		
	
	
		boolean v1 = val >=10 ;
		boolean v2 = val <= 0;
		boolean v1orv2 = v1 || v2;
		System.out.println("v1||v2 =?"+ v1orv2);
		
		// not 부정 v1||v2뒤집기

		boolean rNot = !v1orv2; // ! (val <= 0 || val >=10)
		System.out.println("v1orv2 논리의 부정:"+ rNot);

		
		

	}
	
	//산술 연산
	private static void arithOperEx() {
		int a =7;
		int b = 3;
		System.out.println(-a);
		System.out.println(-1*a);

		System.out.println(a/b); // 정수 나누기 정수는 정수(몫)
		System.out.println(a%b); // 정수 나누기 정수의 나머지


		System.out.println((float)a/(float)b);
		System.out.println((float)a/b);

		System.out.println((float)a%(float)b);
		System.out.println((float)a%b);

int c = 10;
System.out.println(c);
System.out.println(c++);
System.out.println(c);
System.out.println("전위증감");

c=10;
System.out.println(c);
System.out.println(++c);
System.out.println(c);

       int d =10;
       //int e= 0;
       //System.out.println(4/0);
       System.out.println((float)d/0); // infinity


       System.out.println("10.0/0은 유한수?"+ Double.isFinite((float)d/0));

       System.out.println(0.0/0.0); // NaN (NOT A NUMBER)
       System.out.println("0.0 is Nan?"+ Double.isNaN(0.0/0.0));
       
       System.out.println(10.0/0 +10); // Infitiny 있으면 값은 infinity

       System.out.println(0.0/0.0 +10); // Nan 숫자가아니야
       
       
      
       a = a+b;
       a += b;

		
		
	}
/*
 * 
 */
}
