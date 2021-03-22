package com.javaex.jdbc;

import java.sql.*; // sql패키지 내의 모든 클래스 임포트

public class Connectiontest {
	private static String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String DBUSER = "hr"; //접속계쩡
	private static String DBPASS =  "hr"; //비밀번호
	
	public static void main(String[] args) {	
	//1.드라이버 로드 
	//2. 커넥션 확보
		Connection conn = null;
		try {  // 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 확보 
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
			System.out.println("접속정보"+ conn);
			System.out.println("연결 성공");
		}catch(ClassNotFoundException e) {
		System.err.println("드라이버 로드 실패");
		
	}catch(SQLException e) {
		System.err.println("SQL에러");
		e.printStackTrace();
	}finally {
		try {
			conn.close(); // 접속 닫기
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
}
