package com.javaex;
//는 주석이다 컴파일되지않음
public class HelloWorld {
/*
 * 가나다라마바사
 */
	
	//객체가 실행되고자 한다면 main 메서드 필요함
	public static void main(String[] args) {
		//System.out.println("hello world");
		int [][] scores = {
				{ 90, 70, 80, 75, 80 },
					{ 77, 90, 65, 80, 90 },
					{ 80, 75, 95, 80, 75 },
					{ 75, 80, 90, 85, 90 }
				};

//					2차원 배열 요소들의 총 합을 구하는 코드를 작성해 주세요

				int sum =0;
				for(int a =0; a<scores.length;a++) {													
				for (int b=0;b<scores[a].length; b++) {
				sum += scores[a][b]; // 01 02 03 04 05, 11 12 13 14 15,.....								
							}
				}System.out.println(sum);
				
		

				int a = 0;
				for(int i =1; i <100; i+=2){
				a+=i;
				}System.out.println(a);

	}
	
}
