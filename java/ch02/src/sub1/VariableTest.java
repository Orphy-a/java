package sub1;

/*
날짜 : 2024/12/31
이름 : 오재영
내용 : ch02.Java 변수와 연산자
*/

public class VariableTest {
	
	public static void main(String[] args) {
		
		//변수 (재할당 가능)
		int a = 3; //초기화(최초로 변수에 값을 저장)
		int b = 7;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		
		a = 5; //변수 재할당(변수에 값을 다시 저장)
		b = 9;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		
		//상수 (재할당 불가능) (상수는 대문자로 표시)
		final int NUM = 5;
		
		System.out.println("NUM : " + NUM);
		
	}
}
