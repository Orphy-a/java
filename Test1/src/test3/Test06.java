package test3;

class Adder{
	private static Adder instance = new Adder();
	private int x;
	private int y;
	
	
	public static Adder getinstance() {
		return instance;
	}
	
	private Adder() {}
	
	private Adder(int value) {
		y += value;
	}

	
	public void add(int x, int y) {
		this.x += x; //x : 1
		y++; // y: 0 => y값 선언 x 그래서 0이 나온다.
	}
	
	public void add(int[] arr) {
		this.x += arr[0]; // 1 + 10 = 11
		this.y += arr[1]; // 0 + 20 = 20
	}
	
	public static void add(Adder a2) {
		a2.x += 10; // 11 + 10 = 21 => x값
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value); //add(adder a2) 값을 리턴
	}
	
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	
}

public class Test06 {
	public static void main(String[] args) {
		Adder a1 = Adder.getinstance();
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		
		
		a1 = Adder.add(a1,  3); 
		a1.show();
		
		
		/* 1. Adder.add(1, 3) 호출
		 * - a1 객체는 전달되지만 메서드 안에서 실제로 사용 x
		 * - new Adder(3)이 호출
		 * 
		 * 2. 새로운 Adder 객체 생성
		 * - private Adder(int value) 생성자 호출
		 * - y += value를 실행하여 새 객체의 y값을 3으로 초기화
		 * 3. 다시 a1에 재할당 	
		 * 
		 * 
		 * 	*/ 
		
		
		
	}
}
