package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myphone = new SmartPhone("갤럭시", "은색");
		
		
		myphone.show();
		
		myphone.setwifi(true);
		myphone.internet();
		
	}
}
