package com.javaex.oop.casting;

public class CastingApp {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//자신의 인스턴스를 자신의 타입으로 참조
	Dog dog1 = new Dog("백구");
		dog1.eat(); // 부모의 메서드
		dog1.walk(); // 부모의 메서드
		dog1.bark(); // 자식의 메서드
		
		//부모의 인스턴스를 자신의 타입으로 참조
		
		Animal dog2 = new Dog("황구");
		dog2.eat();
		dog2.walk();
		//에러 dog2.bark(); // 참조 타입 Animal 의 메서드만 이용할 수 있음
		//이를 해결하기 위해 참조타입을 부모에서 자식으로 변경해야함 
		//부모타입의 dog2를 자식타입으로 변경하는 것은 다운 캐스팅이라고 함
		
		((Dog)dog2).bark(); // (int)(Math.random()) 같이 .
		
		Animal pet = new Dog("아지"); // 설계도가 dog
		pet.eat();
		pet.walk();
		
		pet = null; // 죽음 
		
		
		pet = new Cat("야엉이"); //설계도가 cat
		pet.eat();
		pet.walk();
		((Cat)pet).meow(); // animal 타입에서 cat 타입으로 강제 타입변환
		//((Dog)cat).bark(); 캣 인스턴스는 도그 클래스의 인스턴스가 아니다. 때문에 형변환을 시도해도 불가능.
		// 다운캐스팅을 시도하기전에 해당 객체 pet의 인스턴스의 설계도(클래스) 확인해야함 
		
		if (pet instanceof Dog) { //만약에 펫의 설계도가 도그라면 bark
			((Dog)pet).bark();
		}else if(pet instanceof Cat) { //설계도가 고양이라면 meow
			((Cat)pet).meow();
		}
		
		
		/*
		 * Cat cat1 = new Cat("애용이");
		 * cat1.eat();
		cat1.meow();
		cat1.walk();
		
		 */
		
		
	}

}
