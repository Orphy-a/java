package sub2;

/*
 * 날짜 : 2025/01/06
 * 이름 : 오재영
 * 내용 : Java 메서드 실습하기 
 * */

public class MethodTest {
	
	// main 메서드 : 자바프로그램의 시작 메서드(진입점)
	public static void main(String[] args) {
		
		
		int a = 1;
		int b = 2;
		System.out.println("a + b = " + add(a,b));

		int y = 1;
		int y1 = 5;
		int y2 = fx(10);
		int y3 = fx(100);
		System.out.println("y = " + fx(y));
		System.out.println("y1 = " + fx(y1));
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		
		// 지역변수와 메서드
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		
	}
	
	
	
	//메서드 정의
	public static int add(int a, int b) { // main 메서드에서 호출 해야하기 때문에 main과 같이 static 키워드 맞춰줌
			
			return a + b;	
	}
	
	public static int fx(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	//start값부터 end값까지 합을 구하는 메서드
	public static int sum(int start, int end) {
		
		int total = 0; // 지역변수 : 메서드 내에 선언한 변수
		
		for(int k = start; k<=end; k++) {
			total+=k;
		}
		
		return total;
	}
	
	
	

}
