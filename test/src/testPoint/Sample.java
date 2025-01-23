package testPoint;

public class Sample {
	public static void main(String[] args) {
		
		//객체 생성
		Mypoint p1 = new Mypoint();
		
		p1.setX(10);
		p1.setY(20);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1의 좌표는 " + px1 + ", Y좌표는" + py1 + "입니다.");
		
		
		
		
	}
}
