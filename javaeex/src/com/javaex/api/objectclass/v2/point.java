package com.javaex.api.objectclass.v2;

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

	@Override
	public boolean equals(Object obj) { //어떤 객체든 파라미터로 전달함.
		if(obj instanceof point) { // obj가 어디서 왓는지.
			//오브젝트 캐스팅임
		point other = (point)obj;
		return this.x ==other.x && this.y ==other.y; // 내가 갖고 있는 값(x,y)이 밖에서 온것(other)과 같은지.
	}else {
		//다른 비교방법은 정의가 안된다. 그냥
		return super.equals(obj);
	}
	
	
	
	
}
}