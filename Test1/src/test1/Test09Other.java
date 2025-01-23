package test1;

public class Test09Other {
	public static void main(String[] args) {
		
		int count = 5;
		
		for(int i = 1 ; i <= count ; i++) {
			for(int j = 1 ; j <= count-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= 2 * i - 1 ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for(int i = 1 ; i <= count-1 ;i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= (count + 4) - 2 * i ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
	}
}
