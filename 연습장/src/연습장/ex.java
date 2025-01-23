package 연습장;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보
    	final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";

		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "select * from `user1`";
			
			PreparedStatement ppst = conn.prepareStatement(sql);
			
			ResultSet rs = ppst.executeQuery();
			
			while(rs.next()) {
				
				User1Class user1 = new User1Class();
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				user1.setUid(uid);
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				System.out.print(uid + "		");
				System.out.print(name + "		");
				System.out.print(hp + "		");
				System.out.println(age + "		");
				
			}
			
			rs.close();
			conn.close();
			ppst.close();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("시스템 종료");
    }
}

