package sub3;

/*
날짜 : 2025/01/02
이름 : 오재영
내용 : Java 조건문 if 실습하기
*/

public class IfTest {
	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 2;
		
		System.out.println("if 예시");

		if(!(num1 == num2)) {
			System.out.println("2개의 숫자가 서로 다릅니다.");
		}
		
		
		if(num1 < num2) {
			System.out.println("num1의 숫자가 num2의 숫자보다 작다.");
		}
		
		//조건이 거짓이므로 실행 x
		if(num1 > num2) {
			System.out.println("num1의 숫자가 num2의 숫자보다 작다."); 
		}
		
		//if 이중으로 사용
		if(num1 > 0) {
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다."); 
			}
		}
		
		//논리연산자 사용
		if((num1 > 0) && (num2 > 1)) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다."); 
			}
		
		
		
		System.out.println();
		
		//if ~ else
		System.out.println("if else 예시");
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1이 var2보다 크다.");
		} else {
			System.out.println("var1이 var2보다 작다.");
		}
		
		System.out.println();
		
		
		//if ~ else if ~ else
		System.out.println("if elseif else 예시");
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1은 n2보다 크다.");
		} else if(n2 > n3){
			System.out.println("n2은 n3보다 크다.");
		} else if(n3 > n4){
			System.out.println("n3은 n4보다 크다.");
		} else {
			System.out.println("n4가 가장 크다.");
		}
		
	}
}
