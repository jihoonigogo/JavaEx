package com.javaex.oop.staticmember;


public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//첫번째 로드 - 스태틱 블록 호출 - > 생성자
		
		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트:"+s1.refCount);
		//스태틱 멤버는 new를 하지않고도 호출가능
		System.out.println("참조카운트:"+StaticEx.refCount);
		

		// 2번째 로드 스태틱 블록은 호출되지 않고 생성자가 호출되었음 
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트:"+StaticEx.refCount);

		
		//해제
		//객체화의 연결관계를 끊기 위해 s1이 힙 메모리의 연결을 끊음
		s1 = null;
		System.out.println("s1 해제");
		System.out.println("참조카운트:"+StaticEx.refCount);



		//임의로 gc부르지말기
		System.gc();//가비지 콜렉터 호출
		try {
			Thread.sleep(1000); //1초대기
			System.out.println("참조카운트:"+s1.refCount);
		}catch(Exception e) {
		}
	}

}
