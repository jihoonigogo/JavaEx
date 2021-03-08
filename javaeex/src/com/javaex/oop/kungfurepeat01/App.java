package com.javaex.oop.kungfurepeat01;

import com.javaex.oop.summary.kungfuSkill;

public class App {
	static kungfuSkill[] dojang; // 인터페이스 배열도 가능함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human m1 = new Human("와따시");
		
		//m1.say();
		//m1.fly();
		//m1.kungfu();
		
		System.out.println("================================");
		Panda p1 = new Panda("퐁퐁이");
		
		//p1.say();
		//p1.kungfu();
		
		
		fight(m1);
		fight(p1);

		dojang = new kungfuSkill[] {
				//(kungfuSkill)h1,
				(kungfuSkill)m1,
				//(kungfuSkill)p1,
				(kungfuSkill)p1
		
	};
	}

	public static void fight(Animal actor) {
		if(actor instanceof KungfuSkill) {
			((KungfuSkill).actor).kungfu();
		}
		
	}
}
