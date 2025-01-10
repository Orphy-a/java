package sub7;

/*
 * 날짜 : 2025/01/10
 * 이름 : 오재영
 * Java 추상 실습
 * */

public  class AbstractTest {
	public static void main(String[] args) {
		
		// 추상클래스는 객체생성 x
		// animal animal = new animal();
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		
	}	
}
