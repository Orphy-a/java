package test4pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Orange{
	
	private String origin;
	private int price;
	
	public Orange(String origin, int price) {
		this.origin = origin;
		this.price = price;
	}

	public void show() {
		System.out.println("원산지 : " + origin);
		System.out.println("가격 : " + price);
	}
	
	
}


public class Test09 {
	public static void main(String[] args) {
		
		List<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("파주", 3000));
		list1.add(new Orange("이천", 3000));
		list1.add(new Orange("수원", 3000));
	
		List<Orange> list2 = new ArrayList<>();
		list2.add(new Orange("청주", 3000));
		list2.add(new Orange("충주", 3000));
		list2.add(new Orange("단양", 3000));
				
		List<Orange> list3 = new ArrayList<>();
		list3.add(new Orange("밀양", 3000));
		list3.add(new Orange("함양", 3000));
		list3.add(new Orange("합천", 3000));
		
		
		Map<String, List<Orange>> map = new HashMap<>();
		map.put("경기도", list1);
		map.put("충북", list1);
		map.put("경남", list1);
		
		//리스트에서 찾기
		List<Orange> list = map.get("경기도");
		Orange orange = list.get(1);
		orange.show();
		
		
		//한줄로 표현
		map.get("충북").get(0).show();
		map.get("경남").get(2).show();
		
		
		
	}
}
