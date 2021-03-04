package com.javaex.practiceexplain;

import java.util.Scanner;

public class pr08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner(System.in);
	
		int balance = 0; //잔고 ?
		boolean run = true; // 이게 제일 ㅜㅇ요한듯
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 |  2.출금 |3. 잔고|4. 종료");
			System.out.println("=============================");
			
			System.out.println("선택 >>");
			int menu = scanner.nextInt();
			int amount =0;
			
			switch (menu) {
			case 1 : //입금
				System.out.println("입금액 >>");
				amount = scanner.nextInt();
				balance += amount;
				break;
				
			case 2 : //출금
				System.out.println("출금액 >>");
				amount = scanner.nextInt();
				balance -= amount;
				break;
				
			case 3 : //잔고 
				System.out.println("잔고 >> " + balance);
			    break;

			
			case 4 : 
				run = false;
				break;
				default :  //없는메뉴
					System.out.println("다시 입력해주세요");
			}
		}
		
		
		
		
	}
	

}
