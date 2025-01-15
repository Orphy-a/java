package Map_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
	public static void main(String[] args) {
		
		
		//리스트 생성
		List<Map<Integer, Mango>> fruitlist = new ArrayList<>();
		
		//맵 생성
		Map<Integer, Mango> mang1 = new HashMap<>(); 
		
		//맵 객체 생성
		mang1.put(101, new Mango("국산", 3000));
		mang1.put(102, new Mango("미국", 2000));
		mang1.put(103, new Mango("일본", 1000));
		
		//맵을 리스트에 집어넣기
		fruitlist.add(mang1);
		
		
		
		
		
		
		Map<Integer, Mango> mang2 = new HashMap<>();
		
		mang2.put(201, new Mango("국산", 4000));
		mang2.put(202, new Mango("미국", 3000));
		mang2.put(203, new Mango("일본", 2000));
		
		fruitlist.add(mang2);
		
	
		
		System.out.println(fruitlist.get(0));
		System.out.println(fruitlist.get(1));
		
		
		
		
		Map<Integer, Mango> mang3 = new HashMap<Integer, Mango>();
		
		
		mang3.put(201, new Mango("국산", 1000));
		mang3.put(202, new Mango("미국", 2000));
		mang3.put(203, new Mango("일본", 3000));
		
		fruitlist.add(mang3);
		
		
		System.out.println(fruitlist);
		
	}
}
