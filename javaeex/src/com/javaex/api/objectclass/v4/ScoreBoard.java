package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//v4. 깊은 복제 
// 내부 참조 변수까지 복제
public class ScoreBoard implements Cloneable {

	//참조형 필드
	
	private int[] scores;
	
	//생성자
	public ScoreBoard(int[] scores) {
		this.scores = scores;
	}
	
	//getter setter 
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ScoreBoard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public ScoreBoard getClone() { // 복제메소드임
		ScoreBoard clone = null; //스코어보드 타입의 clone 초기화??
		try {
			clone =(ScoreBoard)clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	//깊은 복제를 위해서 내부 참조 필드를 복제해야함 .
	// 부모가 같고 있는 clone 메서드를 재정의 해야함 (override)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 얕은 객체를 시도해서 새로운 객체를 주어야함
		ScoreBoard clone = (ScoreBoard)super.clone();
		//2. 깊은 복제
		clone.scores= Arrays.copyOf(scores,scores.length);
		return super.clone();
	}
}
