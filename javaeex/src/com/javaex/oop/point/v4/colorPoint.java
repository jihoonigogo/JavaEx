package com.javaex.oop.point.v4;
//객체를 상속받으려면 extends 써야한다
//최상위는 java.lang.object

public class colorPoint extends point {
	private String color; //자식 클래스의 필드
	public colorPoint (int x, int y ,String color) { //자식클래스의 생성자임
		super(x,y); // 부모 클래스의 필드값임
		this.color = color; // 자식클래스의 인스턴스 변수 color 담아준다. 어디에 ?
	
	}
	
	//getter &setter 
	public String getColor () {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//부모로 부터 들어온 메서드를 물려받았지만 원하는 기능이 부족해서 
	//다른 기능을 수행하고자 할때는 Override(덮어쓰기)
	
	@Override// 컨트롤+스페이스  => 이 메서드는 오버라이드.
	public void draw() {
		System.out.printf("색깔점[x=%d,y=%d, 색상=%s]을 그렸습니다.%n"
				,getX(),getY(),color);
	}
	@Override
	public void draw(boolean show) { // 파라미터의 타입이 위와 다름
        String message = String.format("색깔점[x=%d,y=%d, 색상=%s]를 ",x,y,color);
        if(show) {//true
       	 message+="그렸습니다";
        }else {
       	 message+="지웠습니다";

        }
        System.out.println(message);
}
	}
	
//에러가 나는 이유 
	//1. 생성자를 만들지 않으면 자바 컴파일러가 기본 생성자를 선택해준다.
	/*public colorPoint() {
		//2. 특별히 명시하지 않으면 부모의 기본 생성자를 선택한다.
		super(); // -> 부모클래스에 없음
	}
}
*/
	
