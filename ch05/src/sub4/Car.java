package sub4;

// Car 클래스 정의(설계)
public class Car {
	
	//속성(멤버변수) - protected 접근권한으로 자식클래스에서 참조가능
	protected String name;
	protected String color;
	protected int speed;
	
	//클래스 변수(정적변수) - 객체 생성 없이 클래스 이름으로 직접 참조 / public static 선언
	public static int count = 0;
	
	
	
	
	//생성자 - 캡술화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	
	//기능(멤버메서드)
	public static int getCount(){
		return count;
	}
	
	
	public void speedUp(int speed) {
		//속성 변수에 매개변수값 대입
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);

		}
	
	
	//Getter, Setter 정의(옵션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
