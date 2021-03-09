package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class hashtableex {

	public static void main(String[] args) {
		// map 인터페이스 구현 , 실체클래스 hashtable
	
		Map<String,classroom> map = new Hashtable<>();
		
		//map은 key와 value를 이용한 접근이라 인덱스x
		// 현재 k = string , v = classroom
		
		map.put("101", new classroom("Java","R101"));
		map.put("202", new classroom("C","R202"));
		map.put("303", new classroom("Python","R303"));
		
		System.out.println("MAP : "+ map);
		// 키셋 -> HASHSET 이므로 순서는 없다.
		
		// 조회 
		classroom room = map.get("202");
		System.out.println("202 강의장 : "+ room);

		//값의 변경 
		map.put("202", new classroom("Linux","R202"));
		System.out.println("MAP : "+ map);
		// 동일한 키를 사용해 put하면 내용을 덮어쓴다.
		
		//특정 key가 포함되어 있는가 ?		
		System.out.println("map이 202키를 갖고 있는가 ?" + map.containsKey("202"));
	
		//특정값이 포함되어 있는가 ? subject가 자바인 객체가 있는가 ? 중요
		System.out.println("map has subject java?"+ map.containsValue(new classroom("Java")));
	
		
		//반복자를 활용한 객체 순회
	    Iterator<String> it = map.keySet().iterator(); // key "101"	"202"	"303" ?
		while(it.hasNext()) {
		      classroom item = map.get(it.next());
		      System.out.println(item);
		}
		
		
		
		//삭제
		map.remove("202");
		System.out.println("MAP : "+ map);

		
		
		//비우기
		map.clear();
		System.out.println("MAP : "+ map);

	}

}
