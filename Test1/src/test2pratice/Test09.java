package test2pratice;

import java.util.Scanner;

public class Test09 {
	
	public static int gcd(int a, int b) {
		
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(a % b == 0) {
			return b;
		}else {
			return gcd(b, a%b);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "와 " + b + " 의 최대공약수 : " + gcd(a,b));
		
	}
	
}
