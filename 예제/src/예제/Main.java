package 예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int total = 0;
		int count = sc.nextInt();		
		
		for(int i = 1;i<=count;i++) {
			total += i;
			
		}
		
		System.out.println(total);
		
		
	}
}