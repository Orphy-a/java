package test2pratice;

public class Test02 {
	public static void main(String[] args) {
		int[] arr = {1, 4, 12, 41, 51, 65, 84, 91};
		
		int maxNum = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : " + maxNum);
		
	}
}
