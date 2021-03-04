package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhancFor();
		//arrayCopySystem();
		//arrayCopyFor();
		//twodimens();
//arrayBasic();
}
	
	
	//count를 사용하지 않고 배열 출력
	private static void EnhancFor() {
		char vowels[] = {'a','b','c','d','e'};
		for( char vowel : vowels){
			System.out.print(vowel +"\t");
		}
		
	}
	
	
	//배열복사 시스템객체이용
	private static void arrayCopySystem() {
		int source[]= {1,2,3};
		int target[]=new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		
	
	 for(int i =0; i<target.length;i++) 
		System.out.print( target[i]+"\t");
	}
	
	
// 배열복사 
	

	private static void arrayCopyFor() {
		//배열은 크기 변경이 불가능
		//추가 공간을 확보하려면 새 배열을 만들고 원래 값을 복사해넣음
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		for(int i=0; i<source.length;i++) {
			target[i] =source[i]; // 복사하는 과정 0번부터 2번까지 값을 대입해준다 1,2,3 을 .
			
		}
		for (int i=0; i<target.length;i++) {
			System.out.print(target[i]+" "); // 복사된 값을 확인하는 과정이다. 0,1,2번 칸에 1,2,3이 들어가고 나머지는 정해진 값이 없으므로 0의 정수값이 들어간다 ?
		}
		System.out.println();
	}
	//2차원배열
	private static void twodimens() {
		//int  twodimens[][] =  new int [5][10]; //5행 10열의 표를 갖고 있는 정수배열 
		
		//기본 데이터가 있을 경우의 초기화
		
		int table [][]= {
				{1,2,3,4,5}, // 한 행의 배열 
				{2,3,4,5,6}, // 3행 5열임
				{3,4,5,6,7}
		};
		System.out.println("length of table :"+ table.length); //length = 행의 길이
		System.out.println("length of table[0] :"+ table[0].length); // 2번행
		System.out.println("length of table[1] :"+ table[1].length); //3번행

		//table 배열의 모든 값을 합산해보자
		
		int total  =0; //결과값 변수
		for(int row =0; row<table.length;row++) {
			//행에 접근 
		
			for (int col =0;col<table[row].length; col++) {
			System.out.print(table[row][col]+"\t");
			total += table[row][col];
			}
		System.out.println();
		}
		System.out.println("배열요소의 총합 : " + total);
	}
	
	
	private static void arrayBasic() {
		//배열의 선언
		String[] names; // 문자열 타입의[] 식별자 names
		int scores[]; // 정수 타입의 식별자 score []
		
		//초기화
		names = new String[] {
				"홍길동","장길산","임꺽정","전우치"
		};
		//System.out.println(names);
		
		scores = new int[4]; // 4개짜리 빈 공간을 갖음
	// 안쪽의 공간에 접근 하고자 한다면 index를 사용함.
		System.out.println("Length of scores"+ scores.length);
		scores[0]= 80;
		scores[1]=90;
		scores[2]=75;
		scores[3]=95;
		//scores[4]=100; // 인덱스 범위 0~3을 벗어난 접근이므로 불가함. 오류 
		//System.out.println(scores);arryCopyFor()
		// 값이 있을 경우의 축약형
		float heights[] = {
				178.5f,
				185.0f,
				170.5f,
				188.0f
				
		};
	
		for(int i=0; i<names.length;i++) {
			// 인덱스 범위는 0 ~ length -1 
			System.out.printf("%s(%.2f) : score = %d%n", 
					names[i],heights[i],scores[i]);
		}
		
		int[] scores2 = scores; //참조복사  이는 값을 복사한것이 아닌 주소값만 복사한것.
		System.out.println("scores와 scores2는 같은 객체 ? "+ (scores == scores2));
		
		scores2[3] =100;
		
		for(int i =0; i<names.length; i++) {
			System.out.print(scores[i]+"\t");

		}
		
		
	}
}
