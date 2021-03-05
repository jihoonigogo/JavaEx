package com.javaex.oop.summary;

public abstract class Animal {

	//추상클래스는 객체화 불가능
	//필드를 갖고, 일반 및 추상 메서드 갖음
	
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Animal(String name) {
		this.name =name;
	
	}
	//다른 생성자
	public Animal(String name,int age) {
		this(name);
		this.age=age;
	}
	
	public void eat() { // 일반 메서드
		System.out.println(name +" 가 식사를 하고 있어요");
	}
	
	public abstract void say(); // 추상메서드는 선언만 
}
