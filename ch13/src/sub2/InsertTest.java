package sub2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 오재영
 * 내용 : Java JDBC 접속태스트 실습하기
 */

public class InsertTest {
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "insert into `user1` values ('j101', '김유신', '010-1234-1001', 23)";
			
			stmt.executeUpdate(sql);
			
			// 5단계 - ResultSet 결과 처리(Select 경우) => 조회
			
			
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("insert 완료");
		
	}
}
