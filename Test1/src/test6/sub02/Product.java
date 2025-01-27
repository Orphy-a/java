package test6.sub02;

import java.lang.ProcessHandle.Info;

public class Product {

	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public void updatePrice(int price) {
		this.price = price;
	}
	
	
	public void addStock(int quantity) {
		this.quantity += quantity;
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품 이름 : " + productName);
		System.out.println("가격 : " + price);
		System.out.println("재고 수량 : " + quantity);
		
	}
	
	
	
	
	
}
