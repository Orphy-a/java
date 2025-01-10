package test2pratice;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		
		int[] arr = {20 ,51 ,31 ,54 ,87 ,86 ,15 ,98 ,78 ,54 ,2 ,6 ,19, 100, 1};
		
		for(int i = 0;i<=arr.length;i++) {
			for(int j = i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			int mid = (end - start) / 2;
			if(arr[mid] > value) {
				end = mid-1;
			}else if(arr[mid]<value){
				start = mid+1;
			}else {
				loc = mid;
				state = true;
				break;
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치는 %d번째 있습니다.", loc);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		
		
		
		
		
		
	}
}
