package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/*
 * 날짜 : 2025/01/22
 * 이름 : 오재영
 * 내용 : Java 소켓프로그래밍 실습하기 
 * */

public class SocketClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			System.out.println("연결 요청...");
			// IP주소(루프백), 포트번호
			socket.connect(new InetSocketAddress("127.0.0.1", 5001)); 
			
			System.out.println("연결 성공!");
			
			
			//데이터 송신
			Scanner sc = new Scanner(System.in);
			
			OutputStream os = socket.getOutputStream();
			String msg = sc.next();
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			System.out.println("데이터 송신 완료");
			
			
			//데이터 수신
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
			
			is.close();
			os.close();
			socket.close();
			sc.close();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
}
