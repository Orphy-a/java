package test2pratice;

public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {17, 92, 18, 33, 58, 7, 26, 42};
		
		int max = arr[0];
		
		for(int i = 0; i<arr.length-1;i++) {
			if(max<arr[i+1]) {
				max = arr[i+1];
			}
		}
		
		System.out.println(max);
		
		
	}
}
