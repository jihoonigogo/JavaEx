package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {

	
		Goods notebook = new Goods("LG Gram", 1500000);
		
		Goods smartphone = new Goods("아이폰", 1500000);

		
		
	
		notebook.showInfo();
		
		//악의적 또는 실수로 
		/*
		 * notebook.setPrice(15000);
		 
		*notebook.showInfo();
		 */
		 
		
		System.out.printf("%s,%d원%n",notebook.getName(),notebook.getPrice());
		System.out.printf("%s,%d원%n",smartphone.getName(),smartphone.getPrice());
		smartphone.showInfo();

	}

}
