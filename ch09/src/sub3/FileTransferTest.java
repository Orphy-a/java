package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {
	public static void main(String[] args) {
		
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
				
				
		try {
			//스트림 생성
			FileInputStream fip = new FileInputStream(source);  //입력 스트림
			FileOutputStream fop = new FileOutputStream(target);  //출력 스트림
			
			//파일복사
			fip.transferTo(fop);
			
			
			
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
