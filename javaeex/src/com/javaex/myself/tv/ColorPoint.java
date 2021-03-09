package com.javaex.myself.tv;

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint(String color) {
		this.color =color;
	}
	
	public ColorPoint(int x , int y ,String color) {
		super(x,y);
		this.color  = color;
		
	}
	//public ColorPoint(String color) {
	//	this.color=color;
	//}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.printf("색깔점[x=%d,y=%d, 색상=%s]을 그렸습니다.%n"
				,x,y,color);
	}

	@Override
	public void draw(boolean show) {
		String message = String.format("색깔점[x=%d,y=%d, 색상=%s]를 ",x,y,color);
        if(show) {//true
       	 message+="그렸습니다";
        }else {
       	 message+="지웠습니다";

        }
        System.out.println(message);
}
	
	}
	

