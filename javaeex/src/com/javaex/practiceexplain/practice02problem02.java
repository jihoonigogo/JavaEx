package com.javaex.practiceexplain;

import java.util.Scanner;

public class practice02problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner =new Scanner(System.in);

        int[] values = new int[5];
        for(int i=0;i<values.length;i++) {
        	values[i]=scanner.nextInt();
        }
        	int total =0; //정수 
        	for(int num :values) {
        		total += num;
        	}
        	double avg = (double)total/(double)values.length; //정수값인데.. 실수로 변환되어벎 캐스팅이라고함
        	
        	System.out.printf("합계는 %d,평균은%.2f%n",total,avg);
        	scanner.close();
	} 

}
