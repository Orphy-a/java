package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		
		String sourse = "C:\\Users\\lotte6\\Desktop\\Apple.txt";


		try {
			//기본 스트림 생성
			FileInputStream fis = new FileInputStream(sourse);
			
			//객체 역직렬화를 위한 보조스트림 생성 후 기본스트림과 연결
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			
			//스트림 해제
			ois.close();
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
