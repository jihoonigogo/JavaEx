package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//stringTest();
stringFormatEx();
	}
	
	private static void stringTest() {
		//문자열 선언 
		String str; // 선언하는것 데이터타입 string

		str = "Java"; // 초기화 str은 소스코드임. literal 
		System.out.println("str:" +str);
	
		String str2 = "Java"; // literal
		System.out.println("str2:"+str2);
		
		String str3 = new String("Java");// 새 객체 생성
		System.out.println("str3:"+ str3);
		
		// 세가지 변수는 모두 java 라는 문자열을 담고 있음
		// == , != 는 참조 주소를 비교하는 것이다. 값이 같더라고 해도 출신이 다름.
		
	// .equals() 메서드는 참조 주소가 아닌 각 변수가 갖고 있는 값이 같은지를 비교하는 것이다.
		System.out.println("str == str2?" + (str ==str2));
		System.out.println("str == str3?" + (str ==str3));
		System.out.println("str.eqauls(str2)?" + str.equals(str2));
		System.out.println("str.eqauls(str3)?" + str.equals(str3));
		System.out.println("str2.eqauls(str3)?" + str2.equals(str3));



		//String은 api항목에서 추후 정리

	}

	//System.out.printf("hello %s of %s %n","world","java");
	//String s = String.format("the meaning of the %s is %d", "univ",55);
	//%.2f = 소수점 2번째 자리까지. 일부는 이와 같이 부가정보 첨가가능.
	
	private static void stringFormatEx() {
		// %s 문자열, %d 10진정수,  %f 실수, %n 개행

		// __개의 __중에 __개를 먹었다. 포맷 순서대로 데이터가 나열되어야함.
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		System.out.println(total +"개의"+ fruit + "중에서"+ eat+"개를 먹었다");
		
		String fmt = "%d 개의 %s 중에서 %d개를 먹었다%n";
		System.out.printf(fmt,total,fruit,eat);
		System.out.printf(fmt,5,"수박",2);

		//%f(실수), %%(%)
		//현재 이자율은 1.25% 입니다.

		System.out.printf("현재 이자율은 %.2f%% 입니다%n", 1.25f); // %.2f 는 소수점 2번째 자리까지 표기하는 부가정보임.
		fmt = "현재 이자율은 %.2f%%입니다 %n";
		System.out.printf(fmt, 1.25f);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
