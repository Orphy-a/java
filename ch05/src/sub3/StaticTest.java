package sub3;
/*
 * 날짜 : 2025/01/07
 * 이름 : 오재영
 * 내용 : Java 클래스 변수, 클래스 메소드 실습하기 
 * */
public class StaticTest {
	
	public static void main(String[] args) {
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car granger = new Car("그랜져", "은색", 30);
		
		sonata.show();
		avante.show();
		granger.show();
		
		// 전체 차량 수
		System.out.println("전체 차량 수 : " + Car.count);
		
		// 전체 차량 수 클래스 메서드
		System.out.println("전체 차량 수 : " + Car.getCount());
	
	
		//Increament - static 붙은 num2만 숫자가 오르는 걸 볼 수 있다.
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
	
	
		//싱글톤 실습
		Calc c1 = Calc.getInstance(); //객체생성
		
		int result = c1.puls(1, 2);
		System.out.println("result : " + result);
		
		
		Calc c2 = Calc.getInstance();
	
		int result2 = c2.minus(3, 2);
		System.out.println("result2 : " + result2);
		
	
	}
	
	
	
	
	
	
	
	
	
	
}
