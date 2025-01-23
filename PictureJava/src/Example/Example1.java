package Example;
	
class calculator{
	
	private int num1;
	private int num2;
	
	
	public calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int add() {
		return num1 + num2;
	}
	
	public int subtract() {
		return num1 - num2;
	}
	
	public int multiply() {
		return num1 * num2;
	}
	
	public int divide() {
		return num1 / num2;
	}
	

	
	
}


public class Example1 {
	
	public static void main(String[] args) {
		
		calculator calc = new calculator(5, 20);
		
		System.out.println(calc.add());

		
		
	}
	

}
