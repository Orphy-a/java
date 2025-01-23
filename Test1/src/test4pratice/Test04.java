package test4pratice;

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println(title);
		System.out.println(ext);
		
		String strScores = "60, 72, 82, 86, 92";

		String[] scores = strScores.split(",");
	
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim());
		}
		
		System.out.println("strScore 총점 : " + total);
		
	
	}

  }
  
  
 