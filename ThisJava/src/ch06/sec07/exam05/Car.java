package ch06.sec07.exam05;

public class Car {
	
	//속성
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//생성자
	public Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		
	//기능
	public void show() {
		System.out.println("-----------------");
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("maxSpeed : " + maxSpeed );
		System.out.println("-----------------");
	}
}
