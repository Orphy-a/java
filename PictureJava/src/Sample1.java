
public class Sample1 {
	public static void main(String[] args) {
		
		
		String str1 = "Hello";
		String str2 = new String("Hello"); // str1과 같은 의미다.
		
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(1);
		
		int len = str1.length();
		
		String up = str1.toUpperCase();
		String down = str1.toLowerCase();
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(len);
		System.out.println(up);
		System.out.println(down);
		
	}
}
