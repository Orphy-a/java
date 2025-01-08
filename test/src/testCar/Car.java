package testCar;

public class Car {
	
	//클래스 변수
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		sum+=2;
		System.out.println("자동차 생성 완료");
	}
	
	public void setCar(int number, double gas) {
		this.num = number;
		this.gas = gas;
		System.out.println("차량 번호를 " + num + "로, 연료량을 " + gas + "로 바꾸었습니다.");
	}
	
	//클래스 메소드
	public static void showSum() {
		System.out.println("자동차는 총 " + sum + "대 있습니다.");
	}
	
	public void show() {
		System.out.println("----------------");
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("----------------");
	}
	
	
}
