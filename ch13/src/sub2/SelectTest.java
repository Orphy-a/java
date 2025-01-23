package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class SelectTest {
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		// 결과 셋 저장 리스트 생성
		
		List<User1Class> userls = new ArrayList<>();
		
		try{
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB연결
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 구문
			String sql = "Select * from `user1`";
			
			
			// Select 문은 executeQuery()메서드로 실행!!!
			
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				//ResultSet 커서를 데이터 갯수 만큼 next() 시켜 각 컬럼별 데이터 추출
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				// 추출된 데이터를 가지고 User1 엔티티 객체 생성 및 초기화
				User1Class user1 = new User1Class();
				user1.setUid(uid);
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				//User1 엔티티 객체 리스트 저장
				userls.add(user1);
				
			}
			
			
			rs.close();
			conn.close();
			stmt.close();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1Class user : userls) {
			System.out.println(user);
		}
		
		
		
		System.out.println("select 완료");
	}	
}
