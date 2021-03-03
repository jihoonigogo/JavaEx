package com.javaex.practice01;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max =0;//음수의 최댓값을 넣는다면 0이 제일 큰 값이 되어버림
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		
		for(int i =1; i<=5;i++) {
			System.out.print("숫자:");
			int num = scanner.nextInt();
		if (i==1||num>max) max =num;
	
		}
		System.out.println("최댓값은"+ max +"입니다.");
		scanner.close();
		
		
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		for(int i =1; i<=5;i++) {
			int num = scanner.nextInt();
	
			System.out.println("숫자:" + scanner.nextInt());
			*/
	}
		
	}


