package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 오재영
 * 내용 : Java JDBC 접속태스트 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		
		
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//데이터베이스 연결
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//연결확인
			if(conn != null) {
				System.out.println("연결 성공!");
			}else {
				System.out.println("연결 실패!");
			}
			
			//SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//SQL 실행 구문
			String sql = "update `user1` set `name` = '김유찬', `hp` = '010-4567-1234'"
					   + "where `uid` = 'j101'";
			
			//SQL 실행
			stmt.execute(sql);
			
			//데이터베이스 종료
			conn.close();
			stmt.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
	}
}
