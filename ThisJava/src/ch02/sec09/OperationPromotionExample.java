package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		
		byte result1 = 10+20;
		System.out.println(result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //int 타입으로 변환 후 연산
		System.out.println(result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long 타입으로 변환 후 연산
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6+v7;
		System.out.println(result4); //char 타입에서 int 타입으로 변환x
		System.out.println((char)result4); //char 타입에서 int 타입으로 변환
		
		int v8 = 10;
		int result5 = v8 / 4; //정수 연산의 결과는 정수
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9/4.0; // double 타입으로 변환 후 연산
		System.out.println(result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; //int 타입에서 double 타입으로 변환 후 연산
		System.out.println(result7);
		
	}
}