package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		point p1 = new point(10,10);
		
		//최상위 부모는 항상 Object
		//Object가 갖고 있는 메서드 . 
		//hashCode(); 정수형 개체 식별 정보 메모리 주소값
		//getClass.getName(); 클래스 주소
		//ㄴ   "문자열" + p
		
		System.out.println(p1.getClass()); //p의 객체정보
		System.out.println(p1.getClass().getSimpleName()); // 클래스 정보를 문자열로
		System.out.println(p1.toString()); // 객체 정보를 문자열 반환하는 메서드
		System.out.println(p1);
		//toString(); = sys~ (p) = p.toString(); 출력시 또는 문자열과 연결시 자동호출
		System.out.println(p1.hashCode());// 객체 식별을 위한 유일한 정수
		//hashcod () : 기본적으로 객체의 메모리 주소 
		
		point p2 = new point(10,10);
	
		System.out.println(p2.getClass()); //p의 객체정보
		System.out.println(p2.getClass().getSimpleName()); // 클래스 정보를 문자열로
		System.out.println(p2.toString()); // 객체 정보를 문자열 반환하는 메서드
		System.out.println(p2);
		//toString(); = sys~ (p) = p.toString(); 출력시 또는 문자열과 연결시 자동호출
		System.out.println(p2.hashCode());// 객체 식별을 위한 유일한 정수
		//hashcod () : 기본적으로 객체의 메모리 주소 

		//point p3 = new point(10,10);
		point p3 = p1;
		
		System.out.println("======================");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode()); //p1와 값은 같으나 주소가 다름
		System.out.println(p3.hashCode()); //p1와 주소가 같음
		System.out.println("p1의 hashcode 가 p2의 hashcode와 같은가?)"+(p1.hashCode() == p2.hashCode())) ;
		System.out.println("p1의 hashcode 가 p3의 hashcode와 같은가?)"+(p1.hashCode() == p3.hashCode())) ;

		// 두 객체가 동등함을 알리기 위해서 hashcode가 필요하다 .
	}

}
