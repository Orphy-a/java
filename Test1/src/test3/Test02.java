package test3;

class king{
	private String name;
	private int year;
	
	public void king(int year){
		this("정조");
		this.year = year;
		}
	
	public void king(String name) {
		this.name = name;
	}
	
	public void king(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}
	
}


public class Test02 {
	public static void main(String[] args) {
		king k1 = new king("태조", 1392);
		king k1 = new king("세종대왕");
		king k1 = new king("태조", 1392);
		
	}
}
