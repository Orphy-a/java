package sub3;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.print.PrintException;

public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "update `user1` set `uid`=?, `name`=?, `hp`=?, `age`=? where `uid`='j101'";
			PreparedStatement ppst = conn.prepareStatement(sql);
			
			ppst.setString(1, "j101");
			ppst.setString(2, "홍길동");
			ppst.setString(3, "010-4567-9999");
			ppst.setInt(4, 20);
			
			ppst.executeUpdate();
			
			conn.close();
			ppst.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}
