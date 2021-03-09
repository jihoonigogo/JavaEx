package com.javaex.api;


//사용자 정의 클래스를 비교할 때 .. 
//sort 와 같은! 
// comparable 인터페이스를 구현할수 있어야함 
public class Member implements Comparable{

	String name;
	
	public Member (String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

// 두 객체의 대소비교 로직을 삽임 , String.compareTo
	@Override
	public int compareTo(Object o) {
		// -1 0 1  
		//같을때 : 0
		// 앞의 객체가 작다면 -1
		// 앞의 객체가 크다면 1
		// 비교대상파라미터 o이 member여야 가능.
		if (o instanceof Member) {
		 Member other = (Member)o;
		 return this.name.compareTo(other.name); // 
		}
		return 0;
	}
	
	
}
