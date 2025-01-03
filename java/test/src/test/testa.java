package test;
import java.util.Scanner;

public class testa {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("x값 입력");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println(x);
	}

}
