package Map_test;

public class Banana { //암묵적으로 Object  클래스를 상속
	
	private String country;
	private int price;
	
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
	
	
	


	
}
