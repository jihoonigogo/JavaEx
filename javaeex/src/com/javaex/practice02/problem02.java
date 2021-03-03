package com.javaex.practice02;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		    int avg =0;
            Scanner scanner =new Scanner(System.in);
            for(int i=1; i<=5;i++) {
            int a = scanner.nextInt();
            avg +=a;
	}
    System.out.println("평균은 "+ (avg/5) +"입니다.");
}
}