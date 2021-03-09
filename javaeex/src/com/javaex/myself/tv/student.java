package com.javaex.myself.tv;

public class student extends person{

	protected String schoolName;
	
	
	public student(String schoolName) {
		this.schoolName=schoolName	;		
	}
	public student(String name,int age , String schoolName) {
		super(name,age);
		this.schoolName=schoolName	;		

	}

	@Override
	public void showInfo() {
		System.out.printf("이름은 %s 나이는 %d 학교는 %s에 다니고 있습니다%n", name,age,schoolName);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
