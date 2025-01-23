package sub3;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.print.PrintException;

public class PreparedDeleteTest {
	
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "delete from `user1` where `uid`=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "j101");
	
			pstm.executeUpdate();
			
			pstm.close();
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}