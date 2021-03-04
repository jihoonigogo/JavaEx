package com.javaex.practice01;

import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
// 값을 입력하고 입력한 값 만큼
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = scanner.nextInt();
		int result =0;
		if (a%2==0) { //int startNum = (num%2==0)? 2:1;
			for(int i =2; i<=a;i++) { // i++ 2번보다 i+=2도 된다
				result += i;
				i++;
			}
			System.out.println(result);
			} else if(a%2==1) {for(int i =1; i<=a;i++) {
				result += i;
				i++;
			}
			System.out.println(result);
				
			}
		scanner.close();
		}
		
		}
	

/*
  int result = 0;
  Scanner scanner = new Scanner(System.in);
System.out.println("숫자를 입력하세요");
int a = scanner.nextInt();
int b = a%2;
switch (b){
case 0 : 				for(int i=1; i<=a;i++) {
	if (a%2 ==0)result += i;}System.out.println(result);
break;
case 1 : 				for(int i=1; i<=a;i++) {
	if (a%2 ==1)result += i;}System.out.println(result);
break;
 


}}}*/