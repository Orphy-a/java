package test2pratice;

public class Test03_04 {
	public static void main(String[] args) {
		
		
		int[] arr = {5,6,7,8,9,1,4,3,2};
		
		
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++)
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;	
				}
			
		}
		for(int n = 0;n<arr.length;n++) {
			System.out.print(arr[n] + " ");
		}
		System.out.println();
		
		for(int o = arr.length-1 ; o>=0 ; o--) {
			System.out.print(arr[o] + " ");
		}
		
		
		
	}
}
