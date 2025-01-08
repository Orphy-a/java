package sub1;

/*
 * 날짜 : 2025/01/06
 * 이름 : 오재영
 * 내용 : Java 배열 실습하기 
 * */


public class ArrayTest {
	
	
	public static void main(String[] args) {
	
		//배열
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println();
		
		//배열값 참조
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr3[1] : " + arr3[1]);
		System.out.println("arr3[3] : " + arr3[3]);
		System.out.println("arr3[4] : " + arr3[4]);
		System.out.println();
		
		//배열의 길이
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		System.out.println();
		
		
		//배열의 반복문
		for(int i = 0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(char c : arr2) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		for(String city : arr3) {
			System.out.print(city + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//1차원 배열
		int[] scores = {80,60,78,62,92}; //배열명 복수형태로 선언
		int total = 0;
		int total1 = 0;
		
		for(int i : scores) {
			total += i;			
		}
		System.out.println("scores 합 : " + total);

		for(int score = 0 ; score<scores.length ; score++) {
			total1 += scores[score];
		}
		System.out.println("scores 합 : " + total1);
		System.out.println();
		
		
		//2차원 배열
		int[][] arr2d = {{1,  2,  3,  4}, 
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}};
		System.out.println("arr2d[1][1] : " + arr2d[1][1]);
		System.out.println("arr2d[2][2] : " + arr2d[2][2]);
		System.out.println("arr2d[0][3] : " + arr2d[0][3]);
		System.out.println();
		
		for(int a = 0 ; a < 3 ; a++) {
			for(int b = 0 ; b < 4 ; b++) {
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
			}
		}
		System.out.println();
		
		//3차원 배열
		int[][][] arr3d = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
							{{10, 11, 12}, {13, 14, 15}, {16 ,17, 18}}, 
							{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
		
		for(int a = 0; a<3 ; a++) {
			for(int b = 0; b<3 ; b++) {
				for(int c = 0; c<3 ; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);
				}
			}
		}
		System.out.println();
		
	}
}
