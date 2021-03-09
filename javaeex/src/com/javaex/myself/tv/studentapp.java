package com.javaex.myself.tv;

public class studentapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		person p1 = new person("정우성",45);
		student s1 = new student("서울고등학교");
		student	s2	= new student("이정재",45,"한국고등학교");
		
		p1.showInfo();
		s1.showInfo();
		s2.showInfo();
	}

}
