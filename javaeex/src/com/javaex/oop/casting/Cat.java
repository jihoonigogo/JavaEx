package com.javaex.oop.casting;

public class Cat extends Animal { //애러가 나는 이유는 부모의 생성자를 써서 ?
	//명시하지 않으면 부모클래스의 생성자를 집어넣음. 근데 애니멀의 기본 생성자가 없어서 

	//생성자
	
	public Cat(String name) {
		super(name); // 부모의 생성자 ?
	}
	public void meow() {
		System.out.println(name + ": 왜애용");
	}
}
