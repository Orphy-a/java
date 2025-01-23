package Sub1;

/*
 * 날짜 : 2025/01/15
 * 이름 : 오재영
 * 내용 : Java 제네릭 실습하기 
 * */

public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 2000);
		Banana banana = new Banana("일본", 3000);
		
		
		//제네릭 클래스 생성
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		System.out.println(box2.getFruit());
		
		
	}
}
