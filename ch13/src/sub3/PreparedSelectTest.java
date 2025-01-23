package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1Class;

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		List<User1Class> userls = new ArrayList<User1Class>();
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			String sql = "select * from `user1`";
			PreparedStatement ppsm = conn.prepareStatement(sql);
			
			ResultSet rs = ppsm.executeQuery();
			
			
			
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
				
				
				userls.add(user1);
				
			}
			
			
			rs.close();
			conn.close();
			ppsm.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for(User1Class user : userls) {
			System.out.println(user);
		}
		
		
	}	
}
