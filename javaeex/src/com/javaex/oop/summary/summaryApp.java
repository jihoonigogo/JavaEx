package com.javaex.oop.summary;

public class summaryApp {
    // 쿵푸 도장을 운영하겠다
	static kungfuSkill[] dojang; // 인터페이스 배열도 가능함
	
	public static void main(String[] args) {

		human h1 = new human ("홍길동",30);
		human h2 = new theOne("NEO",50);
		panda p1 = new panda ("핑핑",3);
		panda p2 = new kungfuPanda("퐁",5);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		//도장에 등록
		
		dojang = new kungfuSkill[] {
				//(kungfuSkill)h1,
				(kungfuSkill)h2,
				//(kungfuSkill)p1,
				(kungfuSkill)p2
		};
		for(kungfuSkill member : dojang) {
			member.kungfu();
		}
	}

	public static void fight(Animal actor) {
		// actor로 들어온 h1,h2,p1,h2 객체 들 .. 쿵푸가 가능한지 판별함 
		if(actor instanceof kungfuSkill) {
			//다운캐스팅이 가능함
			((kungfuSkill)actor).kungfu();
		}else {
		System.out.println(actor.name+" : 저는 쿵푸 못하는데요?");
	}
	
}
	private static void fly(Animal actor) {
		if(actor instanceof Flyable) {
			//다운캐스팅이 가능함
			((Flyable)actor).fly();
		}else {
		System.out.println(actor.name+" : 저는 날지도 못하는데요??");
	}
	}
}
