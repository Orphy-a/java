package main;

import java.util.Scanner;

import controller.CustomerController;
import entity.Customer;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRunning = true;
		Customer loginedCustomer = null;
		
		CustomerController customerController = new CustomerController();
		
		
		while(isRunning) {
			System.out.println("----------- 메인 ------------");
			System.out.println("|0. 종료|1. 회원관리|2. 상품관리|3. 주문관리|");
			System.out.println("입력 > ");
			
			int answer = sc.nextInt();
			
			switch(answer) {
			case 0:
				isRunning = false;
				break;
			case 1:
				loginedCustomer = customerController.manage(sc);
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
			
		}
		
		
		
		
	}
	
}
