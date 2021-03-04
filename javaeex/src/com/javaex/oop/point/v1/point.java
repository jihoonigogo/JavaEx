package com.javaex.oop.point.v1;

//필드은닉 , getter , setter , 출력메서드
public class point {
	
	private int x;
	private int y; //필드 은닉
	
	//getter &setter 
	//생성자가 하나도 없으면 컴파일러가 기본생성자를 추가해준다.. 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x; //겹칠때만
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y; //겹칠때만
	}
	
	//출력메서드 
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다%n", x,y);
	}
}
