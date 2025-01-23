package test2pratice;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("입력 값 : ");
		
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length-1;
		boolean state = false;
		int loc = 0;
		
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid]>value) {
				end = mid-1;
			}else if(arr[mid]<value) {
				start = mid+1;
			}else {
				loc = mid;
				state = true;
				break;
			}
			
		}
		
		
		if(state) {
			System.out.println("찾은 위치 : " + loc + "번째");
		}
		
		
		
		
		
	}
}
