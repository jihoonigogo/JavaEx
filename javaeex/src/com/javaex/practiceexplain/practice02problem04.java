package com.javaex.practiceexplain;

public class practice02problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[6]; //6개의 공간을 만들었음
		//(int)(Math.random()*45)+1)
		int idx =0;
		
		while(idx<a.length) {
			//난수 발생시키기
			int choice = (int)(Math.random()*45)+1;
			//중복데이터 체크
			boolean isDuplicated = false;
			if (idx!=0) {
				//중복체크
				for(int i =0;i<idx;i++) {
					//내부값 체크
					if(a[i]==choice) {
						isDuplicated = true;
						break;
					}
				}
			}
			
			if (!isDuplicated) {
				//중복되지 않으면 코드를 수행한다.

				a[idx]=choice;
				idx++;
			}
		}//난수 추출

		for(int value :a) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}
