package sub4;

public class Sedan extends Car {

	private int cc;
	
	// 생성자 - super(부모클래스 속성)
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	
	//부모클래스의 속성을 자식클래스로 참조하기
	public void turbo() {
		// 부모클래스 속성 speed 접근권한을 private 에서 protected로 변경
		speed +=20;
	}
	
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("배기량 : " + this.cc);
		System.out.println("현재속도 : " + this.speed);
		
	}
	
}
