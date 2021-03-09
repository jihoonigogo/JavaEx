package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//basicHashSetEx();
		customHashSetEx();
	
	}
		// TODO Auto-generated method stub
	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student ("홍길동",10);
		Student s2 = new Student ("장길산",20);
		Student s3 = new Student ("임꺽정",30);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부" +hs);

		Student s4 = new Student ("홍길동",10);
		hs.add(s4); // 이름과 아이디 값이 같음에도 new를 통해 만든거라 다름.
		System.out.println("Hashcode of s1 :"+ s1.hashCode());	
		System.out.println("Hashcode of s4 :"+ s4.hashCode());
		System.out.println("s1 equals s4 ? "+ s1.equals(s4));
		//hashcode와 equals가 전부 다르다고 나온다.
		//동등객체 식별은 hashcode와 equals.
		System.out.println("학생부" +hs);

		// 포함 여부 확인 contains?
		boolean exists = hs.contains(new Student("홍길동",10));
		System.out.println("홍길동(10) exists? : " +exists);
		
	}
	private static void basicHashSetEx() {
		
		HashSet<String> hs = new HashSet<>();
		
		//데이터 추가
		hs.add("Java");
		hs.add("c");
		hs.add("c++");
		hs.add("python");
		
		System.out.println("HashSet" +hs);
		System.out.println("요소의 수 " + hs.size());

		hs.add("Java"); // 요소의 중복은 허용하지 않는다
		System.out.println("HashSet" +hs);

		//요소 확인
		System.out.println("Contains Java? "+ hs.contains("Java"));
		//TRUE FALSE 로 주어짐 순서가 없어서 ?
		System.out.println("Contains Java? "+ hs.contains("Linux"));

		
		//요소의 삭제
		hs.remove("c++");
		System.out.println("HashSet" +hs);
		hs.remove("c++"); //없는 값을 삭제한다고해도 에러가 뜨지않음
		System.out.println("HashSet" +hs);

		hs.clear();
		System.out.println("HashSet" +hs);

	}

}
