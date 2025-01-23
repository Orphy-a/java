package ch07.sec02;

public class Phone {
	
	protected String model;
	protected String color;
	
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.print("본인 : " + message);
		System.out.println();
	}
	
	public void receiveVoice(String message) {
		System.out.print("상대방 : " + message);
		System.out.println();
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	

}
