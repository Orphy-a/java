package test4pratice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\lotte6\\Desktop\\Gugudan.txt";
		
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int i = 2 ;i<=9; i++) {
				fw.write("=== " + i + "단 ===\n");
				
				for(int j = 1;j<=9;j++) {
					int z = i * j;
					
					fw.write(i + " * " + j + " = " + z + "\n");
				}
				
			}
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
