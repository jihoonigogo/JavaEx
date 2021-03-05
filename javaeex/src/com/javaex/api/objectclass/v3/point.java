package com.javaex.api.objectclass.v3;

//v3 얕은 복제
//  : 값이 같은 새로운 객체를 생성하는 것 .
//    단순히 필드의 값만 같은 것이다 따라서 객체가 저장되는 주소는 다름.

public class point implements Cloneable { // Clone() 메서드가 활성화

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

	@Override
	public boolean equals(Object obj) { //어떤 객체든 파라미터로 전달함.
		if(obj instanceof point) { // obj가 어디서 왓는지.
			//오브젝트 캐스팅임
		point other = (point)obj;
		return this.x ==other.x && this.y ==other.y; // 내가 갖고 있는 값이 밖에서 온것과 같은지.
	}else {
		//다른 비교방법은 정의가 안된다. 그냥
		return super.equals(obj);
	}
	}
	// getter /setter 	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public point  getClone() {
		//객체 복제 
		point clone = null ; // 비어있는 값
		//예외 처리가 필요함
		try { //시도해서 예외가 있으면 처리하겠습니다 라는 의미
			clone = (point)clone();
	} catch(CloneNotSupportedException e) { // 예외 발생 시 프로그램은 종료되나.. 내가 처리하겠다는 의미
		e.printStackTrace();
	}
	return clone;
	
	
	
	
	
	
	
	}
	
}