package com.javaex.oop.Goodspractice01;

public class Goods {

	private String name;
	private int price;
	
	public Goods() {
		this.name="바람";
		this.price=50;
	}
	public Goods(String name,int price) {
		name="바람";
		price=50;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPrice() {
		return price;		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void showInfo() {
		System.out.printf("상품의 이름은 : %s%n 가격은 %d%n",name,price);
	}
	
	
	
}
