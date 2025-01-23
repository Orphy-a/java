package ch06.sec06.exam01;

public class Car {
	
	String model;
	boolean start;
	int speed;
	
	
	public void show() {
		System.out.println("-------------------");
		System.out.println("모델명 : " + model);
		System.out.println("시동여부 : " + start);
		System.out.println("현재속도 : " + speed);
		System.out.println("-------------------");
	}
	
}
