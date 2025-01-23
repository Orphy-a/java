package Extends;

import java.util.Scanner;

import thread.Car;

public class Sample1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RacingCar rc = new RacingCar(5150, 60.15, 5);
		Car car = new Car(5154, 60.5);
		
		
		rc.setCourse();
		
		car.show();
		rc.show();
		
	}
	
}
