package sub4;

/*
 * 날짜 : 2025/01/07
 * 이름 : 오재영
 * 내용 : Java 클래스 상속 실습하기 
 * */

class parent {
	//속성
	private int num1;
	private int num2;
	
	//생성자
	public parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//기능
	public int plus() {
		return num1 + num2;
	}
}

class child extends parent {
	
	private int num3;
	private int num4;
	
	
	public child(int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
		
	}
	
	public int minus() {
		return num3 - num4;
	}
	
}


public class InheritTest {
	public static void main(String[] args) {
		child child = new child(1, 2, 3, 4);
		
		int result1 = child.plus();
		int result2 = child.minus();
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		// Car 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		
		// account 상속 개체 생성
		StockAccount kb = new StockAccount("KB증권", "101-11-1001", "홍길동", 10000, "삼성전자", 0, 50000);
		
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.show();
		
		kb.sell(5, 60000);
		kb.show();
		
		
		//person 상속 객체 생성
		Doctor dr = new Doctor("가나다", 35, "한의학");
		Engineer eg = new Engineer("홍길동", 28, "소프트웨어");
		
		dr.work();
		eg.work();
		
		
		
	}
	
	
	
	
	
	
	
}