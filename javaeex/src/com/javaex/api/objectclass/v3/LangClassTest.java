package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		point p1 = new point(10,10);
		point p2 = p1; // 참조 복사 (주소만?) 근데 동일 객체 ?
		
		//System.out.println("p1 =>"+ p1);
		//System.out.println("p2 =>"+ p2);

		System.out.println("================");
		p2.setX(20);
		p2.setY(30);
		
		//System.out.println("p1 =>"+ p1); //이걸 이해해야함
		//System.out.println("p2 =>"+ p2);

		
		System.out.println("================");
		point p3 = new point(10,10);
		point p4 = p3.getClone(); // 2. 그럼 이건 무슨 의미임 ? 주소는 같고 값이 다름?
		
		System.out.println("p3 =>"+ p3);
		System.out.println("p4 =>"+ p4);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		System.out.println("================");
		p4.setX(15);
		p4.setY(25);
		
		System.out.println("p3 =>"+ p3); // 1.별개의 공간이라 상대방에게 영향을 미치지 않음.
		System.out.println("p4 =>"+ p4);
		System.out.println("================");
		//System.out.println(p1.hashCode());
		//System.out.println(p2.hashCode());
		System.out.println("================");
		//System.out.println(p3.hashCode());
		//System.out.println(p4.hashCode());
		System.out.println("================");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

		
		// clone = null 이므로 point clone(0,0)이지만 p3를 참조해 clone을 리턴했으니 
		// p3의 getclone은 p3와 같은 10,10을 같는다.
		

	}

}
