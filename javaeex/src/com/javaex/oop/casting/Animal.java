package com.javaex.oop.casting;

public class Animal {

	protected String name; // 필드임
	
	public Animal (String name) {
		// 명시적 생성자
		this.name=name;
	}
	
	public void eat() {
		System.out.println(name +"가 먹고 있습니다"); //부모클래스 애니멀의 메서드1
	}
	public void walk() {
		System.out.println(name +"가 걷고 있습니다"); // 부모클래스 애니멀의 메서드2
	}
}
