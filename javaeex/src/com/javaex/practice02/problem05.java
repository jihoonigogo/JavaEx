package com.javaex.practice02;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int scoreboard[][]= {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}
		};
		int sum =0;
		int avg=0;
		for(int row =0; row<scoreboard.length;row++) {//행
			
		
			for (int col =0;col<scoreboard[row].length; col++) { //열
				if(scoreboard[row][col]>=85) {
					sum += scoreboard[row][col];
					
					avg = (sum/13);
				}
			}
			
		}System.out.println("85점 이상의 총합은"+ sum);
		System.out.println("85점 이상의 평균은"+ avg);//모르겠다 갯수 어떻게 세 ~~
		
	}

}
