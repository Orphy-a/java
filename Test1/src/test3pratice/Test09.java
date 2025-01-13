package test3pratice;

abstract class shape{

	public abstract void draw();
	
}


class circle extends shape {
	
	public void draw() {
		System.out.println("draw circle!");
	}
}

class triangle extends shape{
	public void draw() {
	
		System.out.println("draw triangle!");
	
	}
	
}



public class Test09 {
	
	public void draw(shape shape){
		shape.draw();
	}
	
	
	public static void main(String[] args) {
		
		Test09 t1 = new Test09();
		
		shape circle = new circle();
		shape triangle = new triangle();
		
		t1.draw(triangle);
		t1.draw(circle);
		
		
		
	}
}
