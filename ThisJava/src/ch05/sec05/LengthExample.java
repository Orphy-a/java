package ch05.sec05;

import java.util.Scanner;

public class LengthExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ssn = sc.next();
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		sc.close();
	}
}