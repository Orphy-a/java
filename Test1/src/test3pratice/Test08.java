package test3pratice;

class product{
	String category;
	int price;
	
	
	public product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	
	public void info() {}
	
}

class Television extends product{

	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
		
	}
	
	
	
	
}


class Computer extends product{

	public Computer(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	
	}
	
}




public class Test08 {
	public static void main(String[] args) {
		product p1 = new Television("텔레비전", 100);
		product p2 = new Computer("컴퓨터", 150);
		
		
		p1.info();
		p2.info();
		
		
		
	}
}
