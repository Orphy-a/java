package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//제곱 계산
		List<Integer> squaredNumbers = numbers.stream()
											  .map(num -> num * num)
											  .collect(Collectors.toList());
		
		System.out.println(squaredNumbers);
		
		
	}
}
