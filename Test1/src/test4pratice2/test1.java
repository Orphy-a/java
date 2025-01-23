package test4pratice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args){
		
		int answer = (int)(Math.random()*10)+1;
		int count = 0;
		int input = 0;
		
		
		do {
			
			count++;
			System.out.println("------------");
			System.out.println("answer의 값을 맞춰보세요.");
			System.out.println("1 ~ 10 사이의 값을 입력하세요.");
			
			try {
				
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(0>input) {
					throw new Exception("음수를 입력할 수 없습니다.");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다. 다시 입력하세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수 : " + count);
				break;
			}

			
			
		}while(true);
		
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
