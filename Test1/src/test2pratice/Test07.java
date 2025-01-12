package test2pratice;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "과 " + num2 + "의 최대공약수 : " + gcd(num1, num2));
		
		
	}
	
	public static int gcd(int a, int b) {
		
		int temp = 0;
		
		if(a<b) {
			temp = a;
		} else {
			temp = b;
		}
		
		while (true) {
			if(a % temp == 0 && b % temp == 0) {
				break;
			}
			temp--;
		}
		
		return temp;
		
		
	}
	
	
	
}
