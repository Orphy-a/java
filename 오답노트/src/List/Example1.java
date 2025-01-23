package List;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
		
		//bananas 라는 리스트를 생성
		List<Banana> bananas = new ArrayList<>();
		
		//리스트에 들어갈 객체 생성
		Banana b1 = new Banana("국산", 1500);
		Banana b2 = new Banana("일본", 2000);
		
		//리스트에 b1,b2 객체 집어넣기
		bananas.add(b1);
		bananas.add(b2);
		
		System.out.println(bananas);
		
		
		
		
	}
}
