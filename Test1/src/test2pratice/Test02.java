package test2pratice;

public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {17, 92 ,18 ,33 ,58 ,7, 26, 42};
		int maxnum = arr[0];
		
		
		for(int i = 0;i<arr.length-1;i++) {
			if(maxnum<arr[i]) {
				maxnum = arr[i];
			}
		}
		
		System.out.println("큰 수 : " + maxnum);
			
			

		
		
	}
}
