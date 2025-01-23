package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		
		//프로퍼티 생성 => 맵의 문자열버전
		Properties prop = new Properties();
		//Map<String, String> map = new HashMap<>(); => 똑같음.
		
		prop.setProperty("A", "apple");
		prop.setProperty("B", "banana");
		prop.setProperty("C", "cherry");
		
		System.out.println(prop);
		
		
		//프로퍼티 파일 직렬화
		String target = "C:\\Users\\lotte6\\Desktop\\Fruit.properties"; // 확장자 properties
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			
			//프로퍼티 파일 저장(직렬화)
			prop.store(fos, null);
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		///////////////////////////////////////////////////////////
		
		String sourse = "C:\\Users\\lotte6\\Desktop\\City.properties";
		
		Properties sourseProp = new Properties();
		
		
		try {
			
			FileInputStream fis = new FileInputStream(sourse);
			
			//프로퍼티 파일 읽기
			sourseProp.load(fis);
			
			
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sourseProp);
		System.out.println("kor key : " + sourseProp.getProperty("kor"));
		System.out.println("usa key : " + sourseProp.getProperty("usa"));
		System.out.println("jp key : " + sourseProp.getProperty("jp"));
		System.out.println("ch key : " + sourseProp.getProperty("ch"));
		
		
		
		
		
		
		
		
		
		
	}
}
