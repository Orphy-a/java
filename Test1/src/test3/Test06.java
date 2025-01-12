package test3;

class Adder{
	private static Adder instance = new Adder();
	public static Adder getinstance() {
		return instance;
	}
	
	private Adder() {}
	
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	public static void add(int a2) {
		a2.x += 10;
	}
	
	public static void add(int a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	
}

public class Test06 {
	public static void main(String[] args) {
		adder a1 = adder.
	}
}
