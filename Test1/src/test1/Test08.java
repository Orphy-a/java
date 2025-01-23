package test1;

public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1 ; i <= n  ; i++) {
			for(int j = 0 ; j < n - i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 2 * i - 1 ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
}
