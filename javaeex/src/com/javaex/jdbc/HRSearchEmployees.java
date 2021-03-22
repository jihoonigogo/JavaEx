package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class HRSearchEmployees {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null; //SQL실행을 위한 문맥정보
		ResultSet rs = null; // 실행결과 저장
		Scanner sc = new Scanner(System.in);
	
		
		try {
			//드라이버 접속 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr"); // 접속경로 ,아이디 ,비밀번호
			
			System.out.print("검색어 :");
			String Keyword = sc.next();
			
			//실행할 쿼리 준비, 쿼리에 스캐너 넣는법 !!
			String sql = "SELECT first_name, last_name, "+
			"email , phone_number, hire_date "+
					"FROM employees "+
			"WHERE lower(first_name) LIKE '%" + Keyword + "%' OR "
					+ "lower(last_name) LIKE '%" + Keyword + "%'";
			System.out.println("QUERY :" + sql);
			/*String sql = 
			  " SELECT first_name " +
		   	 "last_name," +
			  "hire_date,"+
			  " FROM employees" +  
			  " WHERE first_name LIKE  " + sc.next() ;*/
			
			
			
			
			stmt = conn.createStatement(); //커넥션으로부터 스테이먼츠를 생성한다.

			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.printf("%s %s: %s , %s , %s%n", 
						rs.getString(1),rs.getString(2),
						rs.getString(3), rs.getString("phone_number")
								,rs.getString("hire_date"));
			}
			
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				sc.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}


}
