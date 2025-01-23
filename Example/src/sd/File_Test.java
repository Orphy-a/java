package sd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_Test {
	public static void main(String[] args) {
		
		String sourse = "C:\\Users\\lotte6\\Desktop\\Test1.txt";
		String target = "C:\\Users\\lotte6\\Desktop\\Test2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(sourse);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				
				int data = fis.read();
				
				if(data ==-1) {
					
					//읽어올 데이터가 없을경우 반복문 종료
					break;
				}
				
				char ch = (char) data;
				System.out.print(ch);
				
				fos.write(data);
				
				
			}
			
			fis.close();
			fos.close();
			
			
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
