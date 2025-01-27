package test6.sub07;

public class Clothes extends Product{
	
	private String size;

	public Clothes(String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
	}
	
	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품이름 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
		System.out.println("사이즈 : " + size);
	}
	
	
}
