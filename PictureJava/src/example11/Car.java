package example11;

public class Car {
	
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량번호를 " + num + "로, 연료량을 " + gas + "바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
