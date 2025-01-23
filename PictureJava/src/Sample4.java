
class Car{
	
	private int num;
	private double gas;
	
	
	public Car() {
		this.num = 0;
		this.gas = 0;
		System.out.println("자동차 생성");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	
	public void show() {
		
		System.out.println("===============");
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("===============");
		
	}

	
}



public class Sample4 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setCar(5153, 30.4);
		car1.show();
		
		Car car2 = new Car();
		car2.setCar(2559, 64.2);
		car2.show();
		
		
	}
}
