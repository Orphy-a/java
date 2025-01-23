package test3pratice;

interface buyer{
	public void buy();
}

interface seller{
	public void sell();
}

class customers implements buyer, seller{
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	
}



public class Test10 {
	public static void main(String[] args) {
		buyer buyer = new customers();
		seller seller = new customers();
		
		buyer.buy();
		seller.sell();
		
	}
}
