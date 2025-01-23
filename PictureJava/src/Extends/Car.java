package Extends;

public class Car {
	
	protected int num;
	protected double gas;
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);

	}
	
	
	
	
}

