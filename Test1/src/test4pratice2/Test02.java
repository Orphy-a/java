package test4pratice2;

import java.util.Scanner;

class NotFoundException extends Exception{
	
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
	
}


public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		try {
			searchArray(input, arr);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
		System.out.println("프로그램 종료");
		
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
