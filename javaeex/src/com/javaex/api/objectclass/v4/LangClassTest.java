package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {

		ScoreBoard s1 = new ScoreBoard(new int[] {10,20,30,40,50});
		System.out.println("s1 = " + s1);
		
		//복제
		ScoreBoard s2 = s1.getClone();
		System.out.println("s2 = "+ s2);
		
		System.out.println("s1 과 s2는 같은 객체? " + (s1 ==s2)); //배열의 값만 같을뿐
		
		//복제된 개채 내부 참조 자료 변경 
		
	
		s2.getScores()[2]=100;
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		//내부 필드 주소 비교
		System.out.println("s1.scores 와 s2.scores는 같은가? "+
		                 (s1.getScores()==s2.getScores())); // s1과 s2는 같은 객체는 아니나 필드값이 같음

	}

}
