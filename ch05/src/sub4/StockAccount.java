package sub4;

public class StockAccount extends Account {

	private String Stock;
	private int amount;
	private int price;
	
	
	public StockAccount(String bank, String ID, String name, int balance, String stock, int amount, int price) {
		super(bank, ID, name, balance);
		Stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
	}
	
	public void show(){
		System.out.println("증권사 : " + this.bank);
		System.out.println("계좌번호 : " + this.ID);
		System.out.println("예금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("주식종목 : " + this.Stock);
		System.out.println("주식수량 : " + this.amount);
		System.out.println("주식가격 : " + this.price);
		System.out.println();
	}
	
	
}
