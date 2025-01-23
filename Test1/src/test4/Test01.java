package test4;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10)+1; // 1부터 10까지 랜덤한 수
		int input = 0; 
		int count = 0;
		
		do {
			count++;
			System.out.println("answer의 값을 맞춰보세요.");
			System.out.print("1~10사이 값 입력 : ");
			
			
			Scanner sc = new Scanner(System.in);
			
			input = sc.nextInt();
			
			if(input<0) {
				throw new Exception("음수를 입력 할 수 없습니다.");
			}
			
			
			
			
			
			
		}while(true);
		
		
		
	}
	
	
	
}
