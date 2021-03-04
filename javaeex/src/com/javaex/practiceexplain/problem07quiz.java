package com.javaex.practiceexplain;

import java.util.Scanner;

public class problem07quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//바깥쪽 루프 
		while(true) { //무한 루프
			//게임로직
			int hide = (int) (Math.random()*100)+1; // 1~100사이의 정수 난수 
			System.out.println("============");
			System.out.println("숫자 맞추기 시작");
			System.out.println("============");

			while(true) { //무한 루프
				System.out.print(hide +">>:");
				int a = scanner.nextInt();
				if (a < hide) {
					System.out.println(" 더 높게");		
				}else if(a>hide){
					System.out.println(" 더 낮게");
				}else if(a==hide) {
					System.out.println("맞았습니다");
					break;					
				}
			}
			
			System.out.println("게임을 종료하겠습니까?(y/n)>>");
			String retry = scanner.next(); // 더 진행하시겠나요 ?
			
			if (retry.equals("y")){
				System.out.println("이용해주셔서 감사합니다. 게임을 종료합니다.");
					break;
		}
		
	}
		scanner.close();
}
}
