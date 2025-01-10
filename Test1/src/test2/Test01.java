package test2;

public class Test01 {
	public static void main(String[] args) {
		
		char str[] = {'I',' ','L','O','V','E',' ','Y','O', 'U'};
		int row, col;
		
		for(row = 0;row <str.length;row++) {
			for (col = 0; col<= row;col++) {
				System.out.print(str[col]);
			}
			System.out.println();
		}
		
	}
}
