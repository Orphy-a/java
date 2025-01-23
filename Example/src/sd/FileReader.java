package sd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class FileReader {
	
	public static void main(String[] args) {
		
		//경로
		String sourse = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
		
		
		try {
		
			//기본스트림
			FileInputStream fis = new FileInputStream(sourse);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while (true) {
				
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
				bos.write(data);
			}
			
			bis.close();
			
			bos.flush();
			bos.close();
			
			fis.close();
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("시스템 종료");
		
		
	}
}
