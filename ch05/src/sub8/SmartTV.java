package sub8;

public class SmartTV extends TV implements Computer {

	@Override
	public void boot() {
		System.out.println("Smart TV boot");
	}

	@Override
	public void internet() {
		System.out.println("Smart TV Internet");
	}
	
	public void process() {
		powerOn();
		boot();
		internet();
	}

}
