package test2pratice;

public class Test01 {
	public static void main(String[] args) {
		
		char[] arr = {'I', ' ', 'L', 'O', 'V', 'E',  ' ', 'Y', 'O', 'U' };
		
		for(int i = 0 ; i<=arr.length-1 ; i++) {
			for(int j = 0;i>=j;j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		
		
	}
	
}