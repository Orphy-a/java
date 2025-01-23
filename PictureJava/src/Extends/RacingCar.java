package Extends;

import java.util.Scanner;

import thread.Car;

public class RacingCar extends Car {
	
	private int course;

	public RacingCar(int num, double gas,int course) {
		super(num, gas);
		this.course = 0;
		System.out.println("레이싱카 생성 완료");
	}
	
	public void setCourse() {
		System.out.println("코스번호를 입력하세요.");
		System.out.print("코스번호 : " );
		Scanner sc = new Scanner(System.in);
		this.course = sc.nextInt();
		
		System.out.println("코스번호를 " + course + "로 지정했습니다.");
	}
	
	
	public void show() {
		super.show();
		System.out.println("코스번호 : " + course);
		System.out.println("------------------");
	}
	
	
	
	
	
}
