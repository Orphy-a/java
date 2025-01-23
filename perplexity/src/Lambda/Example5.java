package Lambda;

import java.util.Arrays;
import java.util.List;

public class Example5 {
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		names.parallelStream()
			 .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));
		
		
	}
}
