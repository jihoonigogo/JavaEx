package com.javaex.api.objectclass.v1;

//v1 object클래스를 살펴보자
// 아무것도 상속받지 않아도 최상위 부모 object를 상속받는다
// 객체의 출력 포맷을 변경하고자 하면 toString을 오버라이드
public class point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public point (int x ,int y) {
		this.x =x; //this에 대해서 다시 한번 이해해보기
		this.y= y;
	}

	//객체를 출력하거나 문자열과 반환할때 반환되는 무나열 형태임
	
	@Override
	public String toString() {

		return String.format("point(x=%d , y = %d)",x,y);
	}
	
	//메서드 없음
	
	
}

