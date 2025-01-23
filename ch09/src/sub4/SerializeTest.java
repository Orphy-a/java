package sub4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
	public static void main(String[] args) {
		
		// 사과 객체 생성
		Apple apple = new Apple("한국", 3000);
		
		//출력 스트림 생성
		String target = "C:\\Users\\lotte6\\Desktop\\Apple.txt";
		
		
		
		try {
			// 기본스트림 생성
			FileOutputStream fos = new FileOutputStream(target);
			// 객체 직렬화를 위한 보조 스트림 생성 후 기본스트림과 연결
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화(객체를 파일로 쓰기)
			oos.writeObject(apple);
			
			oos.close();
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
