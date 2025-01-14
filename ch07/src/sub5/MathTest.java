package sub5;

public class MathTest {
	public static void main(String[] args) {
		
		
		//Math m = new Math();
		
		//기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(-5));
		
		//랜덤 메서드
		double num1 = Math.random();
		System.out.println("num1 : " + num1);
		
		double num2 = num1*10;
		System.out.println("num2 : " + num2);
		
		double num3 = Math.ceil(num2);
		System.out.println("num2 : " + num2);
		
		// 1~ 45
		double rand = Math.ceil(Math.random()*45);
		System.out.println("rand : " + rand);
		
		
	}
}
