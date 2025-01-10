package test3;

abstract class Shape{
	
	public abstract void draw();
		
}

class triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
	
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test09 {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new triangle();
		
		circle.draw();
		triangle.draw();
		
	}
	
	
}
