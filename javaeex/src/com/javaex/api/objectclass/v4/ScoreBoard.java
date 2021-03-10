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
	@Override
	public boolean equals(Object obj) { //어떤 객체든 파라미터로 전달함.
		if(obj instanceof ScoreBoard) { // obj가 어디서 왓는지.
			//오브젝트 캐스팅임
		ScoreBoard other = (ScoreBoard)obj;
		return this.scores==other.scores; // 내가 갖고 있는 값이 밖에서 온것과 같은지.
	}else {
		//다른 비교방법은 정의가 안된다. 그냥
		return super.equals(obj);
	}
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
	// 부모가 갖고 있는 clone 메서드를 재정의 해야함 (override)
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 얕은 복제를 시도해서 새로운 객체를 주어야함
		ScoreBoard clone = (ScoreBoard)super.clone();
		//2. 깊은 복제
		clone.scores= Arrays.copyOf(scores,scores.length);
		return super.clone();
	}
}
*/
}
