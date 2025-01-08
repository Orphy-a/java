package ch02.sec11;

public class VariableScorpeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; //v2 변수 지정 x
	}
}
