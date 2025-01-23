package sub3;

import java.util.Scanner;

/*
날짜 : 2025/01/02
이름 : 오재영
내용 : Java 조건문 switch 실습하기
*/

public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("숫자입력 : ");
		
		//키보드에서 입력받기
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("입력숫자 : " + num1);
		
		//조건값의 결과에 따라 case별 실행흐름으로 분기
		switch(num1 % 2) {
		case 0:
			System.out.println("짝수 입니다.");
			break;
			
		case 1:
			System.out.println("홀수 입니다.");
			break;
			
		default:
			break;
		}
		
		
		
	}
	
		
	
	
	

}
