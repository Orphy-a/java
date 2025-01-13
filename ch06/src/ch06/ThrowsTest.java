package ch06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2025/01/13
 * 이름 : 오재영
 * 내용 : Java Throws 예외처리 실습하기 
 * */

public class ThrowsTest {
	
	public static void main(String[] args) {
		
		// method1, method2에서 throws 예외를 최종적 으로 main에서 처리
		try {
			method1(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	//method1을 호출한 곳으로 exception 예외 던집
	public static void method1(int n1) throws Exception {
		method2(n1);
	}
	
	//method2를 호출한 곳으로 InputMismatchException, ArithmeticException 예외 던짐
	public static void method2(int n1) throws InputMismatchException, ArithmeticException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n2 입력 : ");
		
		int n2 = sc.nextInt();
		int result = n1 / n2;
		
		System.out.println("result : " + result);
		
	}
	
	
}
