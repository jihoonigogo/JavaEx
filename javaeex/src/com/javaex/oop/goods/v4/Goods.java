package com.javaex.oop.goods.v4;


// v4 this 는 객체 자신을 의미한다.
//this() : 내부에 있는 다른 생성자를 호출
public class Goods {
	//필드
	private String name; // 필드의 네임.
    private int price; // 두가지 정보를 은닉시킨 상태임
	
	// 코드내에 생성자가 없으면 컴파일러가 기본 생성자를 추가함.
    // 사용자 정의 생성자가 있으면 기본 생성자를 추가해주지 않는다 .
    
    //생서자1
    public Goods(String name) {
    	this.name = name;
    }
    
    // 모든 필드를 초기화하는 생성자: 생성자2
    public Goods(String name , int price) {
    	//this.name = name;
        this(name);
    	this.price = price;
    }
    // getter /setter
    // getter 만 있고 setter 가 없다면 읽기 전용이기 때문에 필드값을 바꿀 수 없음 .
    public String getName() {
    	
    	return name;
    }
   // public void setName(String name) { //파라미터 네임
   // 	this.name = name; // 현재 인스턴스의 name, 바깥에서 내가 받는 name;
    //}
    public int getPrice() {
    	return price;
    }
  //  public void setPrice(int price) {
  //  	this.price = price;
  //  }
    //출력용 메서드 
    public void showInfo() {
    	System.out.printf("상품이름 :%s%n가격:%d원%n", name,price);
    }
	}


