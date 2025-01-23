package sub2;

// Account 클래스 정의(설계)
public class Account {
	
	//속성(필드, 멤버변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	private String bank;
	private String ID;
	private String name;
	private int balance;
	
	
	//
	public Account(String bank, String ID, String name, int balance) {
		this.bank = bank;
		this.ID = ID;
		this.name = name;
		this.balance = balance;
	}
	
	
	//기능 - 클래스 기능은 무조건 public 선언
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	
	
	public void show() {
		System.out.println("---------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.ID);
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
		System.out.println("---------------------");
	}
	
	//getter, setter
	public int getBalance() {
		return balance;
	}
	
	public String getBank() {
		return bank;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
