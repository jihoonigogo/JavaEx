package com.javaex.oop.point.v3;

//v3 메서드 오버로딩
// 같은 메서드 이름을 가졌지만 파라미터의 타입과 순서, 갯수만 다른 메서드를 의미한다.

public class point {
	
	private int x;
	private int y; //필드 은닉
	
	//getter &setter 
	//생성자가 하나도 없으면 컴파일러가 기본생성자를 추가해준다.. 
	
	public point() {
		//파라미터가 업승ㅁ
		System.out.println("기본 생성자 호출");
	}
  public point(int x ,int y) { //this는 해당 객체를 나타낸다. this(); 한 클래스에서 다른 생성자를 호출 
	  //필수정보와 부가정보 필드가 있음.
	  //생성자(a,b,c); 필수정보 -> 중복사용하지 안혹 this(); + 부가정보;
	  //생성자(a,b,c,d,e,...); 필수 및 부가
		this.x =x;
		this.y = y;
		System.out.println("사용자 정의 생성자 호출");

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
             String message = String.format("점[x=%d,y=%d]를",x,y);
             if(show) {//true
            	 message+="그렸습니다";
             }else {
            	 message+="지웠습니다";

             }
             System.out.println(message);
	}
}
