package sub2;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.print.DocFlavor.STRING;

public class PreparedInsertTest {
	public static void main(String[] args) {
		
		//DB정보
		final String host = "jdbc:mysql://localhost:3306/studydb";
		final String name = "root";
		final String pass = "1234";
		
		
		try {
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 연결
			Connection conn = DriverManager.getConnection(host, name, pass);
			
			// SQL 실행 객체 생성
			String sql = "insert into `user1` values (?, ?, ?, ?)"; // 쿼리 파라미터 ?를 사용해 쿼리문 작성
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 맵핑(사상)
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1006");
			psmt.setInt(4, 23);
			
			System.out.println(psmt);
			
			// SQL실행
			psmt.executeUpdate();
			
			//DB 종료
			psmt.close();
			conn.close();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Insert 완료");
		
	}
}
