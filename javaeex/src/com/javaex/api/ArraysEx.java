package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//배열 조작하는데 도움을 주는 클래스
public class ArraysEx {

	public static void main(String[] args) {
		arrayCopyEx();
		//basicSortAsc();
		//basicSortDesc();
		//customClassSort();
		//basicSearch();
		//customClassSearch();
	}
	//사용자 정의클래스
	private static void customClassSearch() {
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new	Member("전우치")
	};
		Arrays.sort(members);// comparable 인터페이스 구현
		System.out.println("원본:" + Arrays.toString(members));
		//객체 만들어주어야함.  배열속의 홍길동과 new member의 홍길동이 다름.
		int index = Arrays.binarySearch(members, 
				new Member("홍길동"),
				new Comparator<Member>() {

					@Override
					public int compare(Member o1, Member o2) {
						return o1.name.compareTo(o2.name);
					}
			
			
		});
		
		System.out.println("홍길동 검색:" + index);
		
	}
	//배열 속 값을 찾기 (2진 검색, 먼저 sort가 선행되어야함 )
	private static void basicSearch () {
		int[] nums = {5,8,1,3,6,9,10,5,8,2};
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 9); // 범위, 찾고자 하는 값
				
		System.out.println("9의 인덱스 : "+ index);
				
				String [] words = {"Java", "C", "C++", "Python","Linux"};
				System.out.println("원본:" + Arrays.toString(words));
				Arrays.sort(words);
				System.out.println("정렬 : "+ Arrays.toString(words));
				index = Arrays.binarySearch(words,"Java");
				System.out.println("Java의 인덱스"+ index);
	}
	//사용자 정의 클래스의 정렬 
	private static void customClassSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new	Member("전우치")
	};
		System.out.println("원본 배열 : "+ Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 : "+ Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(" 역순 정렬 : "+ Arrays.toString(members));

	}
	
	//기본 자료형의 내림차순 정렬 , 객체화가 필요하다고함 ? 
	private static void basicSortDesc() {
		Integer scores[] = { 80, 50 ,30 , 90 ,75, 88,77 };
		//int 가아닌 integer 인 이유.
		//reverseorder와 같은 특정 클래스 같은 경우 
		//기본타입을 지원하지 않고 객체를 주어야함  ! 
		//그래서 기본타입 int를 integer로 객체화 시켜줌 (포장클래스)
		//자바의 특정 클래스의 경우에는 이렇게 객체화 해주어야함.
		System.out.println("원본 배열 : "+ Arrays.toString(scores));
		
		//역순 정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("내림차순 정렬 : "+ Arrays.toString(scores));
	}
	
	//기본 자료형의 오름차순 정렬
	private static void basicSortAsc() { // asc  = 오름차순
		int scores[] = { 80, 50 ,30 , 90 ,75, 88,77 };
		System.out.println("원본 배열 : "+ Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("오름차순 정렬 : "+ Arrays.toString(scores));
	
	}
	//배열복사
	private static void arrayCopyEx() {
		
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본 : "+ Arrays.toString(src));
		System.out.println(src);
		
		//시스템을 이용한 복사
		char target[] = new char[src.length];
		System.arraycopy(src
				, 0 //시작 인덱스
				, target // 타겟배열
				, 0 //복사시작위치
				, src.length); // 복사할 길이
		
		System.out.println("System을 이용한 배열복사 : "+ Arrays.toString(target));
		
		//arrays 클래스를 이용한 배열의 복제		
		target = Arrays.copyOf(src, src.length); // src배열을 src의 길이만큼 복제		
		System.out.println ("copyof 배열복사 : " + Arrays.toString(target));
		
		//배열의 일부복제		
		target = Arrays.copyOfRange(src,
				5, //복사시작 인덱스
				12);// 복사 끝 인덱스
		System.out.println("copyofrange 지정복사: "+ Arrays.toString(target));
	} 
	
	
	
}
