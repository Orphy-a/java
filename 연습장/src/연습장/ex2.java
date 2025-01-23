package 연습장;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex2 {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "delete from `user1` where `uid`=?";
			
			PreparedStatement ppst = conn.prepareStatement(sql);
			
			ppst.setString(1, "j101");
			
			ppst.executeUpdate();
			
			ppst.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
