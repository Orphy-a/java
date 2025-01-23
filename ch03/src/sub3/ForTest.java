package sub3;

/*
날짜 : 2025/01/02
이름 : 오재영
내용 : Java 반복문 for 실습하기
*/

public class ForTest {
	public static void main(String[] args) {
		
		//for
		System.out.println("for 기초");
		for(int i = 1;i<=10;i++) {
			System.out.println("i : " + i);
		}
		System.out.println();
		
		//1부터 10까지 합
		
		int sum = 0;
		
		for(int i = 1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		System.out.println();
		
		//1부터 10까지 짝수합
		
		int sum1 = 0;
		
		for(int i = 1;i<=10;i++) {
			if(i%2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1부터 10까지 짝수 합 : " + sum1);
		System.out.println();
		
		//for 중첩
		for(int i = 1;i<=3;i++) {
			
			for(int j = 1;j<=5;j++) {
				System.out.println("i : " + i +", " + "j : " + j);
			}
		}
		System.out.println();
		
		
		//구구단
		System.out.println("구구단");
		
		for(int i = 2;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		System.out.println();
		
		
		//별삼각형
		System.out.println("별삼각형 만들기");
		
		int height = 10;
		
		for(int i = 0 ; i<height ; i++) {
			for(int j = 0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i = 0 ; i<height ; i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0 ; i<height ; i++) {
			for(int j = height-1 ; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i<height ; i++) {
			for(int j = height-1 ; j>=i ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		
	}
	
}
