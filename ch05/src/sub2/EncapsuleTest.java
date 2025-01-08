package sub2;


/*
 * 날짜 : 2025/01/07
 * 이름 : 오재영
 * 내용 : Java 캡슐화 실습하기 
 * */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		
		Car sonata = new Car("소나타", "흰색", 10);
		
		// 캡슐화된 속성은 외부에서 직접 참조할 수 없음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테", "검정", 20);
		
		
		
		
		avante.setColor("흰색");
		avante.speedUp(100);
		avante.speedDown(100);
		avante.show();
		
		
		//Account 객체 생성 초기화(캡슐화 적용)
		Account yr = new Account("우리은행", "110-11-1211", "김춘추", 15000);
		
		yr.setBank("유리은행");
		yr.setID("123-45-6789");
		yr.deposit(10000);
		yr.withdraw(5000);
		yr.show();
		
		
		Account kb = new Account("국민은행", "159-15-1597", "김유신", 100000);
		
		kb.setName("김유진");
		kb.setBalance(50000);
		kb.deposit(50000);
		kb.withdraw(100000);
		kb.show();
		
		
	}
}
