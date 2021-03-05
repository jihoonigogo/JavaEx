package com.javaex.oop.Shape2;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape s = new Shape (10,20); // 추상 클래스는 직접 객체화 불가능
		Rectangle r = new Rectangle(10,10,100,50);
		//r.draw();
		Point p = new Point(10,20);
		String s = "Triangle";
		Circle c = new Circle(30,40,10);
		//c.draw();
		drawTest(r);
		drawTest(c);
		drawTest(p);
		drawTest(s);
	}

	
	private static void drawTest(Object obj) {
		//obj를 그리기 위해서는 drawable 인터페이스 내부의 draw 메서드();
		//참조타입이 인터페이스여도 캐스팅할 수 있음.
		
		if(obj instanceof Drawable) {

			((Drawable)obj).draw();
		}else {
			System.out.println("못그려요 ㅜ");
		}
	}
}
