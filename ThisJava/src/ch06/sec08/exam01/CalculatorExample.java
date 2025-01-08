package ch06.sec08.exam01;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		
		//객체생성
		Calculator mycalc = new Calculator();
				
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("----------------");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 종료");
		System.out.println("----------------");
		
		
		int num1 = sc.nextInt();
		
		while (num1>0 && num1<=5)
			if(num1 == 1) {
				System.out.print("x : ");
				int x = sc.nextInt();
				System.out.print("y : ");
				int y = sc.nextInt();
			
				mycalc.plus(x, y);
				
				break;
				
			}else if(num1 == 2) {
				System.out.print("x : ");
				int x = sc.nextInt();
				System.out.print("y : ");
				int y = sc.nextInt();
			
				mycalc.minus(x, y);
				
				break;
				
			}else if(num1 == 3) {
				System.out.print("x : ");
				int x = sc.nextInt();
				System.out.print("y : ");
				int y = sc.nextInt();
			
				mycalc.multi(x, y);
			
				break;
					
			}else if (num1 == 4) {
				System.out.print("x : ");
				int x = sc.nextInt();
				System.out.print("y : ");
				int y = sc.nextInt();
			
				mycalc.divide(x, y);
				
				break;
				
			}else if(num1 == 5) {
				mycalc.powerOff();
				break;
			}
			
			
		
		
		
		
		
	}
}
