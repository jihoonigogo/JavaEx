package com.javaex.practice01;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
problem02();
	}
private static void problem02() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int num = scanner.nextInt();
	for(int i = 1; i<=num; i++) {
		for( int col =1; col<=i; col++)// 갯수를 나타냄. 
			
		System.out.print(i); // "*" 를 넣을 시 갯수만큼의 별이 나옴.
		System.out.println();
	}
	scanner.close();
}

}
