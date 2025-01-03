package test1;

public class Test07 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 1;i<=10;i++) {
			
			if(i % 2 == 0 || i % 3 ==0) {
				total += i;
			}
		}
		
		System.out.println("1부터 10까지 2와 3의 배수의 합 : " + 
		total);
	}
}
