package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test7 {
	public static void main(String[] args) {
		for(int count = 1; count <=5 ;count++) {
			
			System.out.println(makeLotto());
			
		}
	}
	
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random() * 45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
			
		}
	
		//정렬을 위해 treeset 사용
		Set<Integer> treeSet = new TreeSet<Integer>(lottoSet);
		return treeSet;
				
	}
	
	
	
	
}
