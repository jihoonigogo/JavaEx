package com.javaex.collection.hash;

public class classroom {
	//필드
	private String subject;
	private String roomname;
	
	public classroom(String subject) {
		this.subject=subject;
	}
	
	public classroom(String subject,String roomname) {
		this.subject= subject;
		this.roomname=roomname;
	}

	@Override
	public String toString() {
		return "classroom [subject=" + subject + ", roomname=" + roomname + "]";
	}

	@Override
	public int hashCode() {
		//가정 : 과목은 같으나 강의실이 다를 수 있다.
		//과목의 해시코드가 같으면 식별자가 같은것으로하자
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
        if(obj instanceof classroom) {
        	//다운캐스팅
        	classroom other = (classroom)obj;
        return subject.equals(other.subject);
        }
		return super.equals(obj);
	}
	
	
}
