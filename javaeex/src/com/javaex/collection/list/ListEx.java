package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listClassEx();
	}
	
	private static void listClassEx() {
		// list에 관련된 클래스는 list 인터페이스를 구현한다.
	//List<String> lst = new LinkedList<>(); // 실제 클래스는 linked list
	List<String> lst = new ArrayList<>(); //기능의 변경을 통해 형태는 유지한채 효용을 늘림
	
	System.out.println("lst : "+ lst);
	System.out.println("size : " + lst.size());
	
	//객체 추가
	
	lst.add("Java");
	lst.add("C");
	lst.add("C++");
	lst.add("Python");
	
	System.out.println("lst : "+ lst);
	
	//객체 삽입
	lst.add(2,"C#");
	System.out.println("lst : "+ lst);

	lst.add("Java");
	System.out.println("lst : "+ lst);

	//조회  head부터 시작해 #번까지 직접 찾아가므로 arraylist보다 시간이 더 오래걸림
	System.out.println("@번 인덱스	 : "+ lst.get(2));
	
	//루프
	for(String item : lst) {
		System.out.println( item  + " ");
	}
	//반복자를 이용한 순회( 추천))))
	//.Iterator () 반복자를 획득.
	Iterator<String> it = lst.iterator()	;
	while(it.hasNext()) { // 뒤에 내용이 더 있는가 ?
		String item = it.next();
		System.out.print(item+ " ");
	}
	System.out.println();
	
	//객체삭제
	lst.remove(2);
	lst.remove("Java");
	
	//검색
	int position =lst.indexOf("Java");
	System.out.println("lst search : "+ position);
	position = lst.indexOf("Linux"); // 없는 객체의 검색 
	System.out.println("없는 객체의 검색 "+ position);
	
	//비우기
	lst.clear();
	System.out.println("lst : "+ lst);


	
	}
	

}

