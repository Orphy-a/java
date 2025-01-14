import java.util.Scanner;

public class 연습장 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str2 = sc.nextLine();
		
		char ch = str2.charAt(0);
		System.out.println(ch);
		
		int num = str1.indexOf(ch);
		System.out.println(num);
		
		if(num != -1) {
			System.out.println("str1 : " + str1);
			System.out.println("num번째 : " + num+1);
			System.out.println("ch : " + ch);
			
		}else {
			System.out.println("실패");
		}
		
	}
}
