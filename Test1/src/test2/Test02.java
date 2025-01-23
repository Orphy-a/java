package test2;

public class Test02 {
	public static void main(String[] args) {
		
		int arr[] = {17,92,18,33,58,7,26,42};
		int maxNUM = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(maxNUM<arr[i]) {
				maxNUM = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장큰 수 : " + maxNUM);
	}
		
	
}
