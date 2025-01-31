package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User2Dao {

	
	
	
	// DB정보
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
		
	}
	
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void insertUser2(User2 user) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER2);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getCountry());
			
			psmt.executeUpdate();
			closeAll();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void selectUser2(String uid) {
		
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER2);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				User2 user = new User2();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setCountry(rs.getString(4));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void selectUser2List() {
		
		List<User2> list = new ArrayList<User2>();
		
		try {
			
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER2_LIST);
			
			while(rs.next()) {
				User2 user = new User2();
				
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setCountry(rs.getString(4));
				list.add(user);
				
			}
			closeAll();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void updateUser2(User2 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER2);
			psmt.setString(1, user.getUid());
			psmt.setString(1, user.getName());
			psmt.setString(1, user.getBirth());
			psmt.setString(1, user.getCountry());
			psmt.executeUpdate();
			
			closeAll();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteUser2(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER2);
			psmt.setString(1, uid);
			psmt.executeUpdate();
			
			closeAll();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	public void closeAll() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(conn != null) {
			conn.close();
		}
		
	}
	
	
}
