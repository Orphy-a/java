package Lambda;

import java.util.Arrays;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		
		//대문자 표시
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		names.stream()
			 .map(name -> name.toUpperCase())
			 .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		
		//정렬
		List<Integer> num = Arrays.asList(1,5,7,4,45,3,6,8,2);
		
		//오름차순
		num.stream().sorted()
					.forEach(num1 -> System.out.print(num1 + " "));
		
		
		System.out.println();
		
		
		//내림차순
		num.stream()
			.sorted((a,b) -> b-a)
			.forEach(num1 -> System.out.print(num1 + " "));
		
		
		
	}
}
