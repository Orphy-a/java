package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x; //temp에 x값 저장
		x = y; //x값 초기화 후 y 값 저장
		y = temp; //y값 초기화 후 temp값 저장
		System.out.println("x : " + x + ", y : " + y);
	}

}
