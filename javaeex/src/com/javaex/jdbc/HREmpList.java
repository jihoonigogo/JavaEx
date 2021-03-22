package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null; //SQL실행을 위한 문맥정보
		ResultSet rs = null; // 실행결과 저장 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			String sql = "SELECT emp.first_name || ' ' || emp.last_name as name, " +
					"mgr.first_name || ' ' || mgr.last_name as mgr_name " +
					"FROM employees emp, employees mgr " +
					"WHERE emp.manager_id = mgr.employee_id " +
					"ORDER BY name DESC";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			
		/*	//드라이버 로드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
			
			//실행할 쿼리 준비 
			String sql = "SELECT emp.first_name || ' ' || emp.last_name as name, " +
			"mgr.first_name ||' ' || mgr.last_name as mgr_name" +
			"FROM employees emp, employees mgr" + 
			"WHERE emp.manager_id = mgr.employee_id" +
			"ORDER BY name DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			*/
			while(rs.next()) {
				String empName = rs.getString("name");
				String mgrName = rs. getString(2);
				System.out.printf("name : %s , manager : %s%n", empName,mgrName);
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
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}

}
