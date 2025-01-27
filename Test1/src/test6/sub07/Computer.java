package test6.sub07;

public class Computer extends Product {
	
	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
		super(prodId, prodName, price, quantity);
		this.manufactor = manufactor;
	}
	
	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품이름 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
		System.out.println("제조사 : " + manufactor);
	}
	
	
}
