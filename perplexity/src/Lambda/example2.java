package Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class example2 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("aa", "bb", "cc", "dd", "ee");
		
		names.stream().forEach(name -> System.out.print(name + " "));
		

		List<String> names1 = Arrays.asList("ff", "gg", "hh", "ii", "jj");
		
		names1.stream().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		
		List<Integer> numbers = Arrays.asList(1, 2,3,4,5,6,7,8,9,10);
		
		//짝수만 출력
		numbers
			.stream()
			.filter(num -> num % 2 ==0)
			.forEach(num -> System.out.print(num + " "));
		
		
	
		
		
		
		
	}
}

