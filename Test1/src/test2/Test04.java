package test2;

public class Test04 {
	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3, 8, 7, 6, 9};
		
		for(int i= 0 ; i<arr.length-1 ; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		
		for(int n = 0 ; n<=arr.length-1 ; n++) {
			System.out.print(arr[n] + " ");
		}
		
		
		
		
	}
}
