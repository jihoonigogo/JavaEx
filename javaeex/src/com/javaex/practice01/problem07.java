package com.javaex.practice01;

import java.util.Scanner;

public class problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
	// 게임 종료 여부를 묻는 switch case에서 n을 답할 시 break로 끝낸다. y는 다시 원점으로 돌아간다.
			
			int hide = (int) (Math.random()*100)+1;
		
		
		System.out.println("숫자 맞추기 시작");
		
		
		for(int i =1; i<=100;i++) {
			System.out.print(">>:");
			int a = scanner.nextInt();
		if (a < hide) {
			System.out.println(" 더 높게");		
		}else if(a>hide){
			System.out.println(" 더 낮게");
		}else if(a==hide) {
			System.out.println("맞았습니다");

			System.out.println("게임을 종료하겠습니까?");
			
		}
			
		
		}
		
	}
	}
/* 교수님 풀이 
 * 
 * */
