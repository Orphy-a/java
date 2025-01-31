package controller;

import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {
	
	
	
	public Customer manage(Scanner sc) {
		
		Customer loginedCustomer = null;
		
		CustomerService service = CustomerService.getInstance();
		
		
		while(true) {
			System.out.println("---------- 회원관리 -----------");
			System.out.println("|0. 메인|1. 회원가입|2. 로그인|3. 회원목록|");
			System.out.print("입력 > ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				
				return loginedCustomer;
			case 1:
				if(loginedCustomer == null) {
					// 회원가입
					Customer inputCustomer = inputCustomer(sc);
					service.registerCustomer(inputCustomer);
					
					System.out.println("회원가입이 완료 되었습니다.");
				}else {
					// 나의정보
					System.out.println(loginedCustomer);				
				}
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
		}
		
	}
	
	public static Customer inputCustomer(Scanner sc) {
		
		sc.nextLine();
		
		System.out.println("아이디 : ");
		String custId  = sc.nextLine();
		
		System.out.println("이름 : ");
		String custName  = sc.nextLine();
		
		System.out.println("전화번호 : ");
		String hp  = sc.nextLine();
		
		System.out.println("주소 : ");
		String addr  = sc.nextLine();
		
		return new Customer(custId, custName, hp, addr);
		
	}
	

}
