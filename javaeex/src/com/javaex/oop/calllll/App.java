package com.javaex.oop.calllll;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		telephone t1 = new telephone("전화번호",true);
		
		t1.call();
		t1.power();
		
		System.out.println("==========================================");
		
		telephone t2 = new telephone("전화번호",false);

		t2.call();
		t2.power()	;
		
		
		System.out.println("==========================================");

		Smartphone samsung = new Smartphone("핸드폰번호","네이버");
		
		samsung.call();
	
	}

}
