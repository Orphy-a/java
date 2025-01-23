package test3pratice;

class king{
	
	private String name;
	private int year;
	
	
	public king(String name) {
		this.name = name;
		this.year = 1921;
	}
	
	public king(int year) {
		this("정조");
		this.year = year;
	}
	
	public king(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		
		System.out.println("------------");
		System.out.println("name : " + name);
		System.out.println("year : " + year);
		System.out.println("------------");
		
	}
	
	
	
}



public class Test02 {
	
	public static void main(String[] args) {
		king k1 = new king("태조", 1392);
		king k2 = new king("세종대왕");
		king k3 = new king(1776);
		
		k1.show();
		k2.show();
		k3.show();
		
	}
}
