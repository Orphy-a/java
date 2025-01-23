package Example;

class Account{
	
	private int accountNumber;
	private int balance;
	
	
	public Account(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public void deposit(int amount) {
		
		if(amount>0) {
			this.balance += amount;
			System.out.println(amount + "원이 입금되었습니다.");
		}else {
			System.out.println("음수로 입금이 불가능합니다.");
		}
	}
	
	public void withdraw(int amount) {
		if(amount > 0 && balance >= amount ) {
			this.balance -= amount;
			System.out.println(amount + "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족하여 출금이 불가능합니다.");
		}
	}
	

	public int getBalance() {
		return balance;
	}
	
	public void show() {
		System.out.println("================");
		System.out.println("현재 남은잔액 : " + balance);
		System.out.println("================");
	}
	
	
}


public class Example2 {
	public static void main(String[] args) {
		Account account1 = new Account(352-124-56547, 50000);
		Account account2 = new Account(352-454-76624, 10000);
		
		
		account1.deposit(10000);
		account1.deposit(10000);
		account1.deposit(10000);
		account1.deposit(10000);
		
		account1.show();
		
		
		
	}
}
