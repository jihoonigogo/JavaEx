package com.javaex.practice02;

public class problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] data = {1,3,5,7,9,11,15,19,18,20,30,33,31};
		int result1=0;
		int result2=0;
		
		for(int data2 :data) {
			if(data2%3==0) {
			
				result1 = //data2.length; 마찬가지로 배열의 개수를 구하는 방법을 모르겠다.
				result2 +=data2;
			}
			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 ==>"+ result1);
		System.out.println("주어진 배열에서 3의 배수의 합 ==>"+ result2);

	}

}
