package ch07.sec02;

import java.util.Scanner;

public class SmartPhone extends Phone {
	
	private boolean wifi;

	
	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
	}
	
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태가 변경되었습니다.");
	}
	
	public void internet(){
		if(wifi == true) {
			System.out.println("인터넷을 연결합니다.");
		}else {
			System.out.println("인터넷 연결이 취소됩니다.");
			
		}
		
	}
	
	public void show() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("와이파이 상태 : " + wifi);
		super.bell();
		super.sendVoice(sc.next());
		super.receiveVoice(sc.next());
		super.hangUp();
		System.out.println("--------------");
	}
	
	
}
