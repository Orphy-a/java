package test2pratice;

public class Test04 {
	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3};
		
		for(int i = 0;i<4;i++) {
			for(int j = i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp  = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
			
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
