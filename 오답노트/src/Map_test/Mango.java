package Map_test;

public class Mango {
	
	private String country;
	private int price;
	
	public Mango(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	
	public void show() {
		System.out.println("================");
		System.out.println("원산지 : " + country);
		System.out.println("가 격 : " + price);
		System.out.println("================");
		
	}



	@Override
	public String toString() {
		return "Mango [country=" + country + ", price=" + price + "]";
	}
	
	
	
}
