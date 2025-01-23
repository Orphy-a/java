package 연습장;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex3 {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// db연결
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 연결확인
			if(conn != null) {
				System.out.println("연결성공");
			}
			
			
			PreparedStatement ppst = conn.prepareStatement(sql);
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
