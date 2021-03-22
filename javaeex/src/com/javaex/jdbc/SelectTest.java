package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null; //SQL실행을 위한 문맥정보
		ResultSet rs = null; // 실행결과 저장 
		
		try {
			//드라이버 로드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
			stmt = conn.createStatement();
			
			//실행할 쿼리 준비 
			String sql = "SELECT department_id, department_name " +
			"FROM departments";
			
			//쿼리 실행  select - executequery 수행 - resultset으로 가져옴
			rs = stmt.executeQuery(sql);
			
			//레코드 출력 
			while(rs.next()) {
			int deptId = rs.getInt(1); // 컬럼의 순서는 1부터 시작
			String deptName = rs.getString("department_name"); // 컬럼의 이름으로 추출
			
			System.out.printf("%d: %s%n", deptId,deptName);
			}
		}catch (ClassNotFoundException e ) {
			System.err.println("드라이버 로드 실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally { //자원정리
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}

}
