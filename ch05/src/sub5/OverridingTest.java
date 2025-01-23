package sub5;

class AAA{
	public void method1() {
		System.out.println("AAA : method1");
	}
	public void method2() {
		System.out.println("AAA : method2");
	}
	public void method3() {	
		System.out.println("AAA : method3");
	}
}

class BBB extends AAA{
	public void method2() {
		System.out.println("BBB : method2");
	}
	public void method3(int a) {	
		System.out.println("BBB : method3");
	}

}
class CCC extends BBB{
	public void method1() {
		System.out.println("CCC : method2");
	}
	public void method2() {
		System.out.println("CCC : method2");
	}
	public void method3(int a, int b) {	
		System.out.println("CCC : method3");
	}	
}


public class OverridingTest {
	public static void main(String[] args) {
		// Override 메서드 실습
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		
		//Car 상속 객체 오버라이드 메서드
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "검정", 0, 0);
		
		sonata.speedUp(240);
		sonata.show();
		
		bongo.load(10);
		bongo.speedUp(80);
		bongo.show();
		
	}
	
}
