package test3pratice;

class customer{
	
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	
	public customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcprice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("==============");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("==============");
	}
	
	
}

class VIPcustomer extends customer{
	private double saleRatio;

	public VIPcustomer(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
		}
	
	@Override
	public int calcprice(int price) {
		point+= price * pointRatio;
		return price - (int)(price * saleRatio);
	}
	
	
	
	
	
}






public class Test07 {
	public static void main(String[] args) {
		customer kim = new customer(101, "김춘추");
		customer lee = new VIPcustomer(102, "이순신");
		
		kim.showInfo();
		lee.showInfo();
		
	}
}
