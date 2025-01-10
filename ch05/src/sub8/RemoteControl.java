package sub8;

// 인터페이스로 구현
public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp(); // abstract 생략 가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
	
	
	
}
