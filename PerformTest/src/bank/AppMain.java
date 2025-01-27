package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		while(isRunning){
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
		
			
			try {
				
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				if(selectNo == 1) {
					createAccount();
				}else if(selectNo == 2){
					accountList();
				}else if(selectNo == 3){
					deposit();
				}else if(selectNo == 4){
					withdraw();
				}else if(selectNo == 5){
					isRunning = false;
				}else {
					System.out.println("1부터 5까지 숫자중 하나를 입력하세요.");
				}
	
				
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}

		}
		
		System.out.println("프로그램 종료");
		
	}
	
	// 계좌생성 메서드
	public static void createAccount(){
		

		System.out.println("-------------------- 계좌생성 ------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		scanner.nextLine(); // 버퍼지우기
		
		Account newAccount = new Account(ano, owner, balance);
		accounts.add(newAccount);
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
	}
	
	// 계좌목록 메서드
	public static void accountList(){
		
		
		System.out.println("-------------------- 계좌목록 ------------------");
		
		for(Account account : accounts) {
			System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
		}
	}
	
	// 예금메서드
	public static void deposit() {
		System.out.println("-------------------- 예금 ------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액 : ");
		int money = scanner.nextInt();
		scanner.nextLine(); // 버퍼지우기
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌를 찾지 못했습니다.");
		}else {
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : " + account.getAno() + " 계좌로 " + money + "원 예금이 성공되었습니다.");
		}
		
	}
	
	// 출금 메서드
	public static void withdraw() {
		System.out.println("-------------------- 출금 ------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액 : ");
		int money = scanner.nextInt();
		scanner.nextLine();
		
		Account account = findAccount(ano);
		
		
		if(account == null) {
			System.out.println("결과 : 계좌를 찾지 못했습니다.");
		}else {
			
			if(account.getBalance() < money) {
				System.out.println("결과 : 계좌잔액이 부족합니다.");
			}else {
				account.setBalance(account.getBalance() - money);
				System.out.println("결과 : " + money +"원 출금이 성공되었습니다.");
				
			}
		}
	}
	
	//리스트에서 계좌를 찾는 메서드
	public static Account findAccount(String ano) {
		for(Account account : accounts) {
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;
	}
	
	
}
