package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2025/01/07
 * 이름 : 오재영
 * 내용 : Java 클래스 실습하기 
 * */


public class ClassTest {
	public static void main(String[] args) {
		
		//Car 객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 상호작용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		
		//객체 선언
		Car avante;
		
		//객체 생성
		avante = new Car();
		
		//객체 초기화
		avante.name = "아반떼";
		avante.color = "흰색";
		avante.speed = 10;
		
		//객체 상호작용
		avante.speedUp(70);
		avante.speedDown(20);
		avante.show();
		
		
		
		//Account 객체 생성
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.ID = "110-12-1101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.show();
		
		Scanner sc = new Scanner(System.in);
		
		Account bk = new Account();
		bk.bank = "우리은행";
		bk.ID = "110-11-1021";
		bk.name = "김춘추";
		bk.balance = 15000;
		
		bk.deposit(5000);
		bk.withdraw(10000);
		bk.show();
		
		
		Account nh = new Account();
		nh.bank = sc.nextLine();
		nh.ID = sc.nextLine();
		nh.name = sc.nextLine();
		nh.balance = sc.nextInt();
		
		
		nh.show();
		
		
		
		
	}
}