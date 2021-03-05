package com.javaex.oop.staticmember;

public class StaticEx {
//클래스 변수는 static 변수라고도 하며 인스터스에서 공유할 수 있다
	//static 에서 instance로 갈 수 없다. 
	//instance에서 static은 가능하다

	public static int refCount; //인스턴스 생성시 ++ 삭제시 --
	public static String classVar;
	//인스턴스 변수
	//  : 개별 객체로 내부에서만 접근할 수 있다.
	//  : static에서 
	public String instanceVar;
	
	//static 영역 초기화는 스태틱 블록에서만 가능함.
	//클래스가 로드 될때 단 한버남ㄴ 실행
	static {
		refCount =0;
		classVar ="클래스 변수";
		System.out.println("=> Static Block");
		//instanceVar ="인스턴스변수"; // static에서 인스턴스 멤버는 호출할 수 없다.
	}

	//생성자
	public StaticEx() {
		refCount++; //인스턴스 영역에서 스태틱 영역으로 ??가 가능하다.
		//인스턴스를 생성하면서 참조 카운트를 한개씩 늘려나감. 이 생성자는 인스턴스를 생성하는 거임 ?
		System.out.println("=> instance 생성");
		System.out.println("=> 참조count :"+ refCount);

		
	}
@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
