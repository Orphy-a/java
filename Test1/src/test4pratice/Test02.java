package test4pratice;

import java.util.Scanner;

class NotFoundException extends Exception{

	public NotFoundException() {
		super("해당 숫자를 찾을 수 없습니다.");
	
	}
	
	
}


public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("숫자를 찾았습니다.");
			
			
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("시스템 종료");
		
	}
	
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		
		throw new NotFoundException();
		
	}
	
	
	
}
