package test2pratice;

public class Test04 {
	public static void main(String[] args) {
		
		int[] arr = {4, 2, 1, 5, 3, 6, 12, 31, 151};
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
