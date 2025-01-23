package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferIOTest {
	public static void main(String[] args) {
		
		// 파일 경로 설정
				String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
				String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
				
						
				try {
					//스트림 생성
					FileInputStream fip = new FileInputStream(source);  //입력 스트림
					FileOutputStream fop = new FileOutputStream(target);  //출력 스트림
					
					//보조스트림 생성 후 기본 스트림 연결
					BufferedInputStream bip = new BufferedInputStream(fip);
					BufferedOutputStream bop = new BufferedOutputStream(fop);
					
					//스트림데이터 전송
					while(true) {
						
						//입력스트림으로 데이터 읽기
						int data = bip.read();
						
						if(data == -1) {
							//읽을 파일 데이터가 없을 때
							break;
						}
						
						//숫자를 문자로 변환
						
						
						//출력스트림으로 파일 데이터 쓰기 
						bop.write(data);
						
					}
					
					//스트림 해제 => 버퍼스트림 먼제 해제
					bip.close();
					bop.flush(); // 출력버퍼는 해제 전에 비워줘야한다.
					bop.close();
					
					fip.close();
					fop.close();
					
					System.out.println();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("프로그램 종료");
				
				
			}
		
		
}

