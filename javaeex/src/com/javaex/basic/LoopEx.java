package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {//ㅇ인스턴스를 생성하지 않고도  메인을 실행할수있어야함 
	
	public static void main(String[] args) {
     //whileEx01();
     //whilegugu();
  	 //doWhileEx();
		//infLoop();
		//forGugu();
		//continueEx();
		//breakEx01();
		
		quiz01();
		//nestedForStar();
		//sixRandom01();
	}

	private static void infLoop() {
		//while do -while의 경우 반복 조건은 개발자가 책임져ㅑ야함 , 반복조건이 true일 경우 무한루프에 빠짐, 특별한 경우가 아니라면 무한루프를 피하도록해야함.
		while(true) {
			System.out.println("ctrl + c to quit or ..");
		}
	}	
	
private static void doWhileEx() {
	//최소 1회는 반드시 실행되어야하는 반복문  이거 다시 이;해해보기
	
	int total = 0; //합산 결과
	Scanner scanner = new Scanner(System.in);
    int num = 0; //사용자의 입력값
	do {
		System.out.print("정수를 입력하세요 [0이면 종됴]:");
	num = scanner.nextInt();
	total += num;
	} while(num != 0); 
		System.out.println("합산값"+total);
	scanner.close();
}
	
	
private static void forGugu(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("단을 입력하세요");
	int dan = scanner.nextInt();
	
	for (int i =1; 1<=9; i++) {
		System.out.println(dan + "*"+ i +"="+(dan*i));
	}
  }



	private static void whileEx01() {
	
		int i = 0;
		while(i<=5) {
			System.out.println("i like java"+ i);
			
			i++; // 반복문의 종료조건으로 직접 설정해주어야함.
		}
		
	}
	
	// while 은 최초값이 false 일때 실행되지 않을 수 있음. do while 은 최소 한번은 입력
	
	private static void whilegugu() {
		
		Scanner scanner = new Scanner(System.in);
		int num = 1;
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		
		while (num<=9) {
			System.out.println(dan + "*"+num + "="+(dan*num));
			num++;
		}
		scanner.close();// debug - 흐름과 변수의 변화를 확인함. ㅁ> 실행 재개 , ■실행중단 , →↓ 다음라인으
	
}
	
	private static void continueEx() {
		// 1~20 사이의 수에서 2의 배수와 3의 배수를 제외한 숫자를 출력하세요 continue i%2 ==0 || i%3 ==0
		
		for(int i=1; i<=20;i++) {
			if(i%2==0 || i%3 ==0) {continue;}
			System.out.println(i);
		
		
	}
	
	
	}
	//반복의 횟수를 알 수 있을 때 for
	//반복 횟수를 알수 없을 때 while

	private static void breakEx01() {
		int num =1;
		while(true) {
			if(num%6==0 && num%14==0) {break;} //break를 만나면 반복문(루프)를 탈출함
			num++;
		}
		System.out.println(num);
		
	}

	
	
	private static void quiz01() {
		//2단부터 9단까지 구구표 모두 출력
	
		for (int dan =2; dan<=9; dan++) {
			
			System.out.println(dan+ "단");
			for(int num =1; num<=9; num++) {
				System.out.println(dan+"*"+num+"="+(dan*num));
			}
			
		}
		// while문으로 작성해보자
		
		/*int dan = 2;
		while(dan<=9) {
			System.out.println(dan+"단");
			
			int num =1;
			while(num<=9) {
				System.out.println(dan+"*"+num+"="+(dan*num));
				
num++;
			}
			dan++;
		}
		*/
		
	}
	
		
		
		
		private static void nestedForStar() {
			
			int rowCount = 5;
			for(int row =1; row<=rowCount; row++) {
				for(int col =1; col <=row; col++) {
					System.out.print("*");
				}
			System.out.println();// 띄어쓰기
			
			
		}
		}
	
	// TODO : while문으로 만들어보자
		/*
		 * 
		 */
	
		
		private static void sixRandom01() {
			//1~45 정수난수 6개를 출력하기
			
			for(int i =1; i<=6;i++) {
				//System.out.println(Math.random()); 실수값만 뱉음
				System.out.println((int)(Math.random()*45)+1);
			
		}
		
		/*while 문으로 해보기
		
	        int i= 1;
			while(i<=6){
			System.out.println((int)(Math.random()*45)+1);
			i++;
			}
		*/
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

