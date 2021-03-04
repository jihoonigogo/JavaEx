package com.javaex.practiceexplain;

public class practice02problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,3,5,7,9,11,15,19,18,20,30,33,31};
		int total=0;
		int count=0;
		int avg = 0;
		
		for(int data2 :data) {
			if(data2%3==0) {
			
				count ++;//data2.length; 마찬가지로 배열의 개수를 구하는 방법을 모르겠다.
				total +=data2;
				avg =(total/count);
			}			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 ==>"+ count);
		System.out.println("주어진 배열에서 3의 배수의 합 ==>"+ total);
		System.out.println("주어진 배열에서 3의 배수의 평균 ==>"+ avg);

	}

}

	