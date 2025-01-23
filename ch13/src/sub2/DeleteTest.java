package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 연결
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 연결 확인
			if(conn != null) {
				System.out.println("연결 성공!");
			}else {
				System.out.println("연결 실패!");
			}
			
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행구문 
			String sql = "delete from `user1` where `uid` = 'j101'";
			
			// SQL 실행
			stmt.executeUpdate(sql);
			
			// DB 연결해제
			conn.close();
			stmt.close();
			
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
}
