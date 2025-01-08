package testCar;

public class Sample8 {
	public static void main(String[] args) {
		
		//클래스 메소드로 객체 생성을 하지 않아도 불러오기 가능.
		Car.showSum();
		
		//객체 생성
		Car car1 = new Car();
		
		Car.showSum();
		
		Car car2 = new Car();
		car2.setCar(2546, 10.5);
		car2.show();
		
		Car.showSum();
	
	}
}
