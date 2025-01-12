package test2pratice;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {20 ,51 ,31 ,54 ,87 ,86 ,15 ,98 ,78 ,54 ,2 ,6 ,19, 100, 1};
		
		System.out.print("찾을 숫자 : " );
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length-1;
		int loc = 0;
		boolean state = false;
		
		while (start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] > value) {
				end = mid-1;
			}else if (arr[mid] < value) {
				start = mid-1;
			} else {
				loc = mid;
				state = true;
				break;
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치는 : %d번째 있습니다.", loc + 1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();
		
		
		
	}
}
