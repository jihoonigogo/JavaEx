package com.javaex.oop.goods.v2;


// v2 필드의 접근 제한 Goods 가 필드임.
// getter 와 setter를 이용한 필드의 우회적 접근기능 만들기
public class Goods {

	//필드
	// public > protected상속받은클래스 > default동일패키지 > private폐쇄
	private String name; // 필드의 네임.
    private int price; // 두가지 정보를 은닉시킨 상태임
	
	
    // getter /setter
    public String getName() {
    	
    	return name;
    }
    public void setName(String name) { //파라미터 네임
    	this.name = name; // 현재 인스턴스의 name, 바깥에서 내가 받는 name;
    }
    public int getPrice() {
    	return price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
    //출력용 메서드 
    public void showInfo() {
    	System.out.printf("상품이름 :%s%n가격:%d원%n", name,price);
    }
	}


