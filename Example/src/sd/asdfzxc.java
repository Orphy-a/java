package sd;

import java.util.Scanner;

public class asdfzxc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==0 && b>=45) {
			a = 24;
			if(b>=45) {
				a-=1;
				b= 60+(b-45);
			}
		}else {
			if(b>=45) {
				b=b-45;
			}else{
				a-=1;
				b= 60+(b-45);
			}
		}
		
		System.out.println(a+ " " +b);
		
	}
}
