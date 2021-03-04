package com.javaex.practiceexplain;

public class practice02problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[6]; //6개의 공간을 만들었음
		//(int)(Math.random()*45)+1)
		int idx =0;
		
		while(idx<a.length) { //idx는 0이고 길이는 6개이므로 6개의 난수를 만들어냄
			int choice = (int)(Math.random()*45)+1;
			//중복데이터 체크하기.
			boolean isDuplicated = false;
			if (idx!=0) { //2번째부터 6번째 난수
				//중복체크
				for(int i =0;i<idx;i++) {//0-1 , 1-1~2, 2-1~3 ....
					//내부값 체크
					if(a[i]==choice) { //중복값이 나올 경우
						isDuplicated = true;
						break; //멈춘다.
					}
				}
			}
			
			if (!isDuplicated) {
				//중복되지 않으면 코드를 수행한다.

				a[idx]=choice; // 랜덤으로 나온 값이 이미 나온 값과 같을 경우
				idx++; // 기회를 한번 씩 늘린다.
			}
		}//난수 추출

		for(int value :a) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}
