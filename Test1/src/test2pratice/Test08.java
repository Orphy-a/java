package test2pratice;


public class Test08 {
	
	public static void main(String[] args) {
		
		
		int num1 = 5;
		
		
		System.out.println(num1 + "! : " + factorial(num1));
		
		
	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
}
