package test4pratice;

import java.util.Scanner;

class LoginException extends Exception{

	public LoginException(String msg) {
		super(msg);
	}
	
}



public class Test03 {
	public static void main(String[] args) {
	
		String ID = "a101";
		String PW = "1q2w3e4r";
		
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			String inputID = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String inputPW = sc.nextLine();
						
			if(!ID.equals(inputID)) {
				throw new LoginException("아이디가 일치하지 않습니다.");
			}else if(!PW.equals(inputPW)) {
				throw new LoginException("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("로그인 성공!");
			}
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
			
		
		
		
		
	}
}
