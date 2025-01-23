import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		System.out.println("검색어를 입력하세요.");
		
		String str2 = sc.next();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		System.out.println(str1);
		
		
		if(num != -1) {
			System.out.println(str1 + "의 " + (num+1) + "번째에서 '" + ch + "' 를 발견하였습니다.");
		}else {
			System.out.println(str1 + "에서 " + ch + " 를 찾을 수 없습니다..");	
		}
		
		
		sc.close();
		
	}
}
