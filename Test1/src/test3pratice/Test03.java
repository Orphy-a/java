package test3pratice;

class Car{
	
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drive(){
		System.out.println(name + " 운행 중...");
	}
	
	public void info() {
		System.out.println("브랜드 : " + brand);
		System.out.println("차량명 : " + name);
		System.out.println("가  격 : " + price);
	}
	
	
	
}



public class Test03 {
	public static void main(String[] args) {
		
		Car sonata = new Car("현대", "소나타", 3000);
		Car genesis = new Car("?", "제네시스", 12000);
		Car bmw = new Car("BMW", "520d", 5000);
		
		sonata.drive();
		sonata.info();
		
		genesis.drive();
		genesis.info();
		
		bmw.drive();
		bmw.info();
		
		
		
	}
}
