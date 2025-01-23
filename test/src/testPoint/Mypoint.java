package testPoint;

public class Mypoint {
	
	//속성
	private int x;
	private int y;
	
	//생성자
	public void MyPoint() {
		
		this.x = 0;
		this.y = 0;
		
	}
	
	public void MyPoint(int px, int py) {
		
		if(px>=0 && px>=100) {
			this.x = px;
		}else {
			this.x = 0;
		}
		
		if(py>=0 && py>=100) {
			this.y = py;
		}else {
			this.y = 0;
		}
	}
	
	
	public void setX(int px) {
		if(px>=0 && px<=100)
		this.x = px;
	}
	
	public void setY(int py) {
		if(py>=0 && py<=100)
		this.y = py;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
}
