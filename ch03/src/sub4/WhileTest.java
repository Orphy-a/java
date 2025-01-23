package sub4;

/*
날짜 : 2025/01/03
이름 : 오재영
내용 : Java 반복문 while 실습하기
*/

public class WhileTest {
	public static void main(String[] args) {
		
		//1부터 10까지 합
		
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		//do-while : 최초 한 번은 반복문장을 실행하는 반복문
		int tot = 0;
		int j = 1;
	
		do {
			if(j % 2 == 0) {
				tot += j;
			} 
			j++;
		}while(j<=10);
		
		System.out.println("1부터 10까지 짝수 합 : " + tot);
		
		
		//break
		int num = 1;
		
		while(true) {
			if(num % 7 == 0 && num % 5 == 0) {
				break; //반복문 탈출
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		
		
		//continue
		int total = 0;
		int k = 0;
		
		
		while(k <= 10) {
				k++;
			if(k % 2 == 1) {
				continue; //반복문 상위로 이동
			}
			total += k;
		}
		System.out.println("1붙너 10까지 짝수 합 : " + total);
		
		
	}
}
