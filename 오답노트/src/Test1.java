import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Fruit{
	
	private String origin;
	private int price;
	
	public Fruit(String origin, int price) {
		this.origin = origin;
		this.price = price;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public int getPrice() {
		return price;
	}

	
	@Override
	public String toString() {
		return "Fruit [origin=" + origin + ", price=" + price + "]";
	}
	
	
}

class Apple extends Fruit{

	public Apple(String origin, int price) {
		super(origin, price);
	}
	
}

class Banana extends Fruit{

	public Banana(String origin, int price) {
		super(origin, price);
	}
	
	
}



public class Test1 {
	public static void main(String[] args) {
	
		Map<Integer, Fruit> bananaMap = new HashMap<>();
		
		bananaMap.put(101, new Banana("국산", 5000));
		bananaMap.put(102, new Banana("미국산", 4000));
		bananaMap.put(103, new Banana("일본산", 3000));
		
		
		Map<Integer, 
		Fruit> appleMap = new HashMap<>();
		
		appleMap.put(201, new Apple("국산", 3000));
		appleMap.put(202, new Apple("미국산", 2000));
		appleMap.put(203, new Apple("일본산", 1000));
		
		
		List<Map<Integer, Fruit>> fruitList = new ArrayList<>();
		
		
		fruitList.add(bananaMap);
		fruitList.add(appleMap);
		
		System.out.println(fruitList);
		
		
		
	}
}
