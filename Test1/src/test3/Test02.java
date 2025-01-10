package test3;

public class King{
	
	private String name;
	private int year;
	
	
	public void king(int year) {
		this("정조");
		this.year = year;
	}
	
	public void king(String name) {
		this.name = name;
	}
	
	public void King(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public void show() {
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}





public class Test02 {
	public static void main(String[] args) {
		King k1 = new King("태조", 1392);
		King k2 = new King()
	}
}
