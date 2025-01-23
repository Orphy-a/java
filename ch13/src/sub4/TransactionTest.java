package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class TransactionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		
		// DB 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
		final String USER = "root";
		final String PASS = "1234";
		
		Connection conn = null;
		
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//DB연결
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
///////////////트랜젝션 자동 커밋해제 => 자바는 기본적으로 자동커밋(모든 작업을 성공처리)
			conn.setAutoCommit(false);
			
			
			
			String sql1 = "update `bank_account` set `a_balance`=`a_balance`-10000 where `a_no`=?";
			String sql2 = "update `bank_account` set `a_balance`=`a_balance`+10000 where `a_no`=?";
			
			//SQL실행 객체 생성
			PreparedStatement ppst1 = conn.prepareStatement(sql1);
			ppst1.setString(1, "101-11-1001");
			
			PreparedStatement ppst2 = conn.prepareStatement(sql2);
			ppst2.setString(1, "101-11-1003");
			
			
			//SQL 실행
			ppst1.executeUpdate();
			
			
			// ppst1과 ppst2가 같이 실행되는 것 = 트랜젝션
			// ppst1은 실행되고 ppst2는 실행x
			if(answer == 1) {
				throw new Exception("에러 발생");
			}
			
			ppst2.executeUpdate();
			
///////////////작업 확정(데이터베이스 작업 반영)
			conn.commit();
			
			
			// DB 연결해제
			conn.close();
			ppst1.close();
			ppst2.close();
			
			

		}catch (Exception e){
			e.printStackTrace();
			
			
			try {
/////////////// 작업 취소(DB SQL 실행전으로 돌아가기 => rollback())
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}
}
