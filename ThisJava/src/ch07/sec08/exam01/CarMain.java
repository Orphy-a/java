package ch07.sec08.exam01;

public class CarMain {
	public static void main(String[] args) {
		Car mycar = new Car();
		Car mycar1 = new Car();
		
		mycar.tire = new Tire();
		mycar.run();
		
		mycar.tire = new HankookTire();
		mycar.run();
		
		mycar1.tire = new GumhoTire();
		mycar1.run();
		
		
	}
	
	
	
}
