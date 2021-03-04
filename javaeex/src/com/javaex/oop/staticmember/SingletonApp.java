package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Singleton s1 = new Singleton(); //private 생성자라서 불가능함.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1 ->"+ s1);
		System.out.println("s2 ->"+ s2); // s1 = s2는 같은 객체다.
		
		System.out.println("s1과 s2는 같은 객체 ? "+ (s1==s2));

	}

}
