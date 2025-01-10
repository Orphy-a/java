package test2pratice;

public class test01 {
	public static void main(String[] args) {
		
		
		char[] c = {'I',' ','L','O','V','E',' ','Y','O','U'};
		
		for(int i = 1;i < c.length;i++) {
			for(int j = 0 ; i>=j ; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
		
	}
	
}
