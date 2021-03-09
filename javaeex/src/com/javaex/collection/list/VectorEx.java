package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//벡터의 선언
		Vector<Integer> v = new Vector<>();
		
		System.out.println("Size : "+ v.size() + ", Capacity :" + v.capacity());
		
		//1부터 10까지의 값을 담아보자		
		for(int i =1; i <=10; i++) {
			//값을 뒤에 추가
			v.addElement(i);
		}
		System.out.println("v :" + v);
		System.out.println("Size : "+ v.size() + ", Capacity :" + v.capacity());

		//허용량 초과 -> 자도으로 크기를 늘림		
		v.addElement(11);
		System.out.println("Size : "+ v.size() + ", Capacity :" + v.capacity());


		//중간에 삽입 .insert(숫자)
		v.insertElementAt(7, 5);//7이라는 객체를 5번 인덱스에 삽입
		System.out.println("v : "+ v);
		
		//객체 참조 .elementAt(숫자)		
		System.out.println("5번 인덱스의 객체 : "  + v.elementAt(5));
		
		//객체 검색
	     int index = v.indexOf(6); // 6번 객체의 인덱스는 ?	
			System.out.println("index of 6 번 : "+ index);
			index = v.indexOf(0);
			System.out.println("index of 0 번 : "+ index); // 없는 객체의 인덱스 = -1

		// 포함여부
		System.out.println("v가 10을 포함하고 있는가 ? " + v.contains(10));
		
		//객체 삭제 
		System.out.println("v : "+ v);
        v.removeElement(7); // 내부에게 7이라는 객체를 삭제함.
		System.out.println("v : "+ v);
		v.removeElementAt(8); // 8번 객체를 삭제함
		System.out.println("v : "+ v);

		//내부 객체 출력
		for (int i =0 ; i<v.size(); i++) {
			Integer item = v.elementAt(i);	
			System.out.print(item  + " ");
		}System.out.println("");
		

		//내부 객체 출력 enhanced for (비권장) 배열의 경우에는 괜찮음. 
		// vector의 경우에는 
		for ( Integer item : v) {
			System.out.print(item + " ");
		}System.out.println()	;
		
		
		//vector -> enumeration 을 받아와서 순회( 권장..근데 잘몰겟다)
		Enumeration<Integer> e = v.elements()	; // 메모리 효율이 좋음
		
		while (e.hasMoreElements()) { //뒤에 더 남은 객체가 있는가 ?
			Integer item = e.nextElement(); //실제 데이터 꺼내고 뒤로이동 
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		//벡터비우기 
		v.clear();
		System.out.println("v : "+ v );
		System.out.printf("size of v : %d , capacity of v : %d%n", v.size(),v.capacity());
		
		
		
		
		
		
		
		
		
		
		
	}

}
