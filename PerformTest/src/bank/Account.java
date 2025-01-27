package bank;

public class Account {
	
	//클래스 변수
	private String ano;
	private String owner;
	private int balance;
	
	
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//Getter
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//Setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
