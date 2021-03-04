package com.javaex.oop.point.v4;

//v4 상속 
//    : 부모클래스 point 를 이용해서 
public class point {
	
	protected int x;
	protected int y; 
	
  public point(int x ,int y) { 
		this.x =x;
		this.y = y;
	//	System.out.println("사용자 정의 생성자 호출");

	}
	
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
		System.out.printf("점[x=%d, y=%d]을 그렸습니다%n", x,y); //get이 반환한 값
	}
	public void draw(boolean show) { // 파라미터의 타입이 위와 다름
             String message = String.format("점[x=%d, y=%d]를 ", x,y);
             if(show) {//true
            	 message+="그렸습니다";
             }else {
            	 message+="지웠습니다";

             }
             System.out.println(message);
	}
}
